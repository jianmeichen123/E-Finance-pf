package com.dsh.m.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

import jetbrick.util.StringUtils;
import jodd.datetime.JDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsh.m.dao.PurchaseDetailMapper;
import com.dsh.m.dao.PurchaseMapper;
import com.dsh.m.model.Purchase;
import com.dsh.m.model.PurchaseDetail;
import com.dsh.m.model.PurchaseExample;
import com.dsh.m.util.ConstructString;
import com.dsh.m.util.DateUtil;
import com.dsh.m.util.OrderUtil;
import com.dsh.m.util.redis.Cache;
import com.dsh.m.util.redis.Redis;

@Service
public class PurchaseService {
	
	@Autowired
	private PurchaseMapper purchaseMapper;
	@Autowired
	private PurchaseDetailMapper purchaseDetailMapper;
	
	@Transactional
	public Integer savePurchase(Integer userid, String dealTime) {
		Purchase purchase = new Purchase();
			String orderid;
		if (DateUtil.getIntervalDays(dealTime, DateUtil.getCurrentDate()) == 0) {
			orderid = ConstructString.getOrderId();
		} else {
			PurchaseExample purchaseExample=new PurchaseExample();
			purchaseExample.createCriteria().andInputtimeEqualTo(DateUtil.parseDate(dealTime));
			purchaseExample.setOrderByClause("purid DESC");
			List<Purchase> list=purchaseMapper.selectByExample(purchaseExample);			// 如果查询的这一天没有一个单号
			if (list.isEmpty()) {
				orderid = OrderUtil.getFirstOrderId(dealTime);
			} else {
				orderid = OrderUtil.changOrderId(list.get(0).getOrderid());
			}
		}

		//String ordernum = OrderUtil.generateOrderNo();
		purchase.setOrderid(orderid);
		purchase.setInputtime(new Date());
		purchase.setCustomerid(userid);
		purchaseMapper.insertSelective(purchase);
		
		Cache cache = Redis.use();
		String key = "purchasecart:"+userid;
		Set<String> keys = cache.hkeys(key);
		for(String k:keys) {
			String text = cache.hget(key, k);
			String[] strs = text.split("\\|", -1);
			BigDecimal amount = new BigDecimal(strs[0]);
			BigDecimal unitPrice = new BigDecimal(strs[1]);
			BigDecimal totalPrice = amount.multiply(unitPrice);
			PurchaseDetail detail = new PurchaseDetail();
			detail.setAmount(amount);
			if(strs.length == 2){
				detail.setBeizhu("");
			}else{
				detail.setBeizhu(strs[2]);
			}
			detail.setDealTime(new JDateTime(dealTime, "YYYY-MM-DD").convertToDate());
			detail.setGoodsid(Integer.parseInt(k));
			detail.setOrderid(orderid);
			detail.setUnitPrice(unitPrice);
			detail.setTotalPrice(totalPrice);
			detail.setPurchaseid(purchase.getPurid());
			purchaseDetailMapper.insertSelective(detail);
		}
		
		cache.getJedis().del(key);
		return purchase.getPurid();
	}

}
