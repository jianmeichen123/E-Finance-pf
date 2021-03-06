package com.dsh.m.web;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dsh.m.dao.IndexOrderMapper;
import com.dsh.m.dao.PurchaseorderMapper;
import com.dsh.m.dao.SettleaccountMapper;
import com.dsh.m.dao.SettleaccountchildMapper;
import com.dsh.m.model.Purchaseorder;
import com.dsh.m.model.Settleaccount;
import com.dsh.m.model.SettleaccountExample;
import com.dsh.m.model.Settleaccountchild;
import com.dsh.m.model.SettleaccountchildExample;
import com.dsh.m.service.SettleService;

@RequestMapping("/settle")
@Controller
public class SettleAction extends BaseAction {
	
	@Autowired
	private SettleaccountMapper settleaccountMapper;
	@Autowired
	private SettleaccountchildMapper settleaccountchildMapper;
	@Autowired
	private PurchaseorderMapper purchaseorderMapper;
	@Autowired
	private SettleService settleService;
	@Autowired
	private IndexOrderMapper indexOrderMapper;
	
	@RequestMapping("/list")
	public String list(HttpSession session, ModelMap model) {
		Integer userid = super.getUserId(session);
		SettleaccountExample example = new SettleaccountExample();
		example.createCriteria().andCustomeridEqualTo(userid);
		example.setOrderByClause("createtime desc");
		List<Settleaccount> settles = settleaccountMapper.selectByExample(example);
		for (int i = 0; i < settles.size(); i++) {
			BigDecimal returnMoney = indexOrderMapper.getReturnMoney(settles.get(i).getId());
			if(returnMoney == null){
				settles.get(i).setReturnmoney(new BigDecimal(0));
			}else{
				settles.get(i).setReturnmoney(returnMoney);
			}
		}
		model.addAttribute("settles", settles);
		return "settle/list";
	}
	
	@RequestMapping("/childs")
	public String childs(Integer id, ModelMap model) {
		Settleaccount settle = settleaccountMapper.selectByPrimaryKey(id);
		SettleaccountchildExample example = new SettleaccountchildExample();
		example.createCriteria().andSettleidEqualTo(id);
		example.setOrderByClause("orderdate desc");
		List<Settleaccountchild> childs = settleaccountchildMapper.selectByExample(example);
		JSONArray array = JSON.parseArray(JSON.toJSONString(childs));
		@SuppressWarnings("rawtypes")
		Iterator iter = array.iterator();
		boolean cansettle = true;
		while(iter.hasNext()) {
			JSONObject json = (JSONObject)iter.next();
			Integer orderid = json.getInteger("orderid");
			Purchaseorder order = purchaseorderMapper.selectByPrimaryKey(orderid);
			Integer balancestate = order.getBalancestate();
			if(balancestate==0 || settle.getReturndate().compareTo(new Date()) >= 0) cansettle = false;
			json.put("order", order);
		}
		model.addAttribute("settle", settle);
		model.addAttribute("childs", array);
		model.addAttribute("cansettle", cansettle);
		return "settle/childs";
	}
	
	@ResponseBody
	@RequestMapping("/confirm")
	public String confirm(Integer id) {
		try {
			settleService.confirm(id);
			return success("确认成功！！");
		} catch (Exception e) {
			e.printStackTrace();
			return fail("确认失败！！");
		}
	}
	
}
