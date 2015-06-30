package com.dsh.m.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import jodd.datetime.JDateTime;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dsh.m.dao.PurchaseorderChildMapper;
import com.dsh.m.dao.PurchaseorderMapper;
import com.dsh.m.dao.SettleaccountMapper;
import com.dsh.m.dao.SettleaccountchildMapper;
import com.dsh.m.dao.SupplyCustomerMapper;
import com.dsh.m.enumtype.OrderStatusEnum;
import com.dsh.m.model.Goods;
import com.dsh.m.model.Purchaseorder;
import com.dsh.m.model.PurchaseorderChild;
import com.dsh.m.model.PurchaseorderChildExample;
import com.dsh.m.model.Settleaccount;
import com.dsh.m.model.SettleaccountExample;
import com.dsh.m.model.Settleaccountchild;
import com.dsh.m.model.SupplyCustomer;
import com.dsh.m.model.SupplyCustomerExample;
import com.dsh.m.util.OrderUtil;

@Service
public class OrderService {
	
	@Autowired
	private SupplyCustomerMapper supplyCustomerMapper;
	@Autowired
	private PurchaseorderMapper purchaseorderMapper;
	@Autowired
	private PurchaseorderChildMapper purchaseorderChildMapper;
	@Autowired
	private ShoppingCartService shoppingcartService;
	@Autowired
	private SettleaccountMapper settleaccountMapper;
	@Autowired
	private SettleaccountchildMapper settleaccountchildMapper;
	
	@Transactional
	public int createOrder(Integer userid, JSONArray products) {
		
		SupplyCustomerExample example = new SupplyCustomerExample();
		example.createCriteria().andCustomeridEqualTo(userid);
		List<SupplyCustomer> list = supplyCustomerMapper.selectByExample(example);
		Integer supplyid = null;
		if(CollectionUtils.isNotEmpty(list)) {
			supplyid = list.get(0).getSupplyid();
		}
		
		Purchaseorder order = new Purchaseorder();
		order.setOrdernum(OrderUtil.generateOrderNo());
		order.setCustomerid(userid);
		order.setSupplyid(supplyid);
		order.setOrdertype(OrderStatusEnum.WAIT.getCode());
		order.setChildcount(products.size());
		order.setOrdertime(new Date());
		purchaseorderMapper.insertSelective(order);
		int orderid = order.getId();
		@SuppressWarnings("rawtypes")
		Iterator iter = products.iterator();
		while(iter.hasNext()) {
			JSONObject json = (JSONObject)iter.next();
			Goods goods = (Goods)json.get("goods");
			int num = json.getIntValue("num");
			PurchaseorderChild child = new PurchaseorderChild();
			child.setOrderid(orderid);
			child.setGoodsid(goods.getGoodsid());
			child.setAmount(new BigDecimal(num));
			purchaseorderChildMapper.insertSelective(child);
		}
		
		shoppingcartService.clearUserCart(userid);
		return orderid;
	}
	
	@Transactional
	public void confirm(Integer orderid, String json) {
		JSONArray array = JSON.parseArray(json);
		@SuppressWarnings("rawtypes")
		Iterator iter = array.iterator();
		while(iter.hasNext()) {
			JSONObject obj = (JSONObject)iter.next();
			BigDecimal num = obj.getBigDecimal("num");
			int goodsid = obj.getIntValue("goodsid");
			PurchaseorderChild child = new PurchaseorderChild();
			child.setCheckamount(num);
			PurchaseorderChildExample example = new PurchaseorderChildExample();
			example.createCriteria().andOrderidEqualTo(orderid).andGoodsidEqualTo(goodsid);
			purchaseorderChildMapper.updateByExampleSelective(child, example);
		}
		
		Purchaseorder order = new Purchaseorder();
		order.setId(orderid);
		order.setOrdertype(OrderStatusEnum.FINISHED.getCode());
		purchaseorderMapper.updateByPrimaryKeySelective(order);
	}
	
	@Transactional
	public void afterconfirm(JSONObject data) {
		int orderid = data.getIntValue("id");
		Date ordertime = data.getDate("ordertime");
		int customerid = data.getIntValue("customerid");
		int supplyid = data.getIntValue("supplyid");
		String ordernum = data.getString("ordernum");
		BigDecimal totalprice = data.getBigDecimal("totalprice");
		SettleaccountExample example = new SettleaccountExample();
		example.createCriteria().andCustomeridEqualTo(customerid);
		example.setOrderByClause("createtime desc");
		example.setLimitStart(0);
		example.setLimitEnd(1);
		List<Settleaccount> sas = settleaccountMapper.selectByExample(example);
		boolean flag = true;
		int settleid = 0;
		if(CollectionUtils.isNotEmpty(sas)) {
			Settleaccount fsa = sas.get(0);
			Date starttime = fsa.getStarttime();
			Date endtime = fsa.getEndtime();
			if(ordertime.after(starttime)&&ordertime.before(endtime)) {
				settleid = fsa.getId();
				BigDecimal orgtotal = fsa.getOrdertotalmoney();
				Settleaccount newfsa = new Settleaccount();
				newfsa.setId(settleid);
				newfsa.setOrdertotalmoney(orgtotal.add(totalprice));
				settleaccountMapper.updateByPrimaryKeySelective(newfsa);
				flag = false;
			}
		}
		if(flag) {
			Settleaccount sa = new Settleaccount();
			sa.setCustomerid(customerid);
			sa.setSupplyid(supplyid);
			sa.setSettlenum(OrderUtil.generateSettleNo());
			sa.setOrderperoidnum(OrderUtil.generatePeriodNo());
			sa.setOrdernum(1);
			Date start = new JDateTime(ordertime).setHour(0).setMinute(0).setSecond(0, 0).convertToDate();
			Date end = new JDateTime(start).addDay(7).convertToDate();
			sa.setStarttime(start);
			sa.setEndtime(end);
			sa.setOrdertotalmoney(totalprice);
			settleaccountMapper.insertSelective(sa);
			settleid = sa.getId();
		}
		Settleaccountchild child = new Settleaccountchild();
		child.setOrderid(orderid);
		child.setOrdernum(ordernum);
		child.setOrderdate(ordertime);
		child.setOrdertotalmoney(totalprice);
		child.setSettleid(settleid);
		settleaccountchildMapper.insertSelective(child);
	}

	@Transactional
	public void aftercreate(JSONObject data) {
		
	}

}
