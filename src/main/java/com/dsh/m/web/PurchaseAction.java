package com.dsh.m.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dsh.m.dao.GoodsBclassMapper;
import com.dsh.m.dao.GoodsMapper;
import com.dsh.m.dao.GoodsSclassMapper;
import com.dsh.m.dao.PurchaseDetailMapper;
import com.dsh.m.model.Goods;
import com.dsh.m.model.GoodsBclass;
import com.dsh.m.model.GoodsBclassExample;
import com.dsh.m.model.GoodsExample;
import com.dsh.m.model.GoodsSclass;
import com.dsh.m.model.GoodsSclassExample;
import com.dsh.m.model.PurchaseDetail;
import com.dsh.m.model.PurchaseDetailExample;

@RequestMapping("/purchase")
@Controller
public class PurchaseAction extends BaseAction {
	
	@Autowired
	private PurchaseDetailMapper purchaseDetailMapper;
	@Autowired
	private GoodsBclassMapper goodsBclassMapper;
	@Autowired
	private GoodsSclassMapper goodsSclassMapper;
	@Autowired
	private GoodsMapper goodsMapper;
	
	@RequestMapping("/detail")
	public String detail(Integer purchaseid, ModelMap model) {
		PurchaseDetailExample example = new PurchaseDetailExample();
		example.createCriteria().andPurchaseidEqualTo(purchaseid);
		List<PurchaseDetail> details = purchaseDetailMapper.selectByExample(example);
		model.addAttribute("details", details);
		return "purchase/detail";
	}
	
	@RequestMapping("/input")
	public String input(ModelMap model) {
		List<GoodsBclass> bclasses = goodsBclassMapper.selectByExample(new GoodsBclassExample());
		Integer bclassid = bclasses.get(0).getBclassid();
		GoodsSclassExample sclassExample = new GoodsSclassExample();
		sclassExample.createCriteria().andBclassidEqualTo(bclassid);
		List<GoodsSclass> sclasses = goodsSclassMapper.selectByExample(sclassExample);
		Integer sclassid = sclasses.get(0).getSclassid();
		GoodsExample goodsExample = new GoodsExample();
		goodsExample.createCriteria().andSclassidEqualTo(sclassid);
		List<Goods> goods = goodsMapper.selectByExample(goodsExample);
		model.addAttribute("bclasses", bclasses);
		model.addAttribute("sclasses", sclasses);
		model.addAttribute("goods", goods);
		return "purchase/input";
	}
	
	@SuppressWarnings("unchecked")
	@ResponseBody
	@RequestMapping("/loadsclass")
	public String loadsclass(Integer bclassid) {
		GoodsSclassExample sclassExample = new GoodsSclassExample();
		sclassExample.createCriteria().andBclassidEqualTo(bclassid);
		List<GoodsSclass> sclasses = goodsSclassMapper.selectByExample(sclassExample);
		Integer sclassid = sclasses.get(0).getSclassid();
		GoodsExample goodsExample = new GoodsExample();
		goodsExample.createCriteria().andSclassidEqualTo(sclassid);
		List<Goods> goods = goodsMapper.selectByExample(goodsExample);
		@SuppressWarnings("rawtypes")
		Map map = new HashMap();
		map.put("sclasses", sclasses);
		map.put("goods", goods);
		return success(null, map);
	}
	
	@ResponseBody
	@RequestMapping("/loadgoods")
	public String loadgoods(Integer sclassid) {
		GoodsExample goodsExample = new GoodsExample();
		goodsExample.createCriteria().andSclassidEqualTo(sclassid);
		List<Goods> goods = goodsMapper.selectByExample(goodsExample);
		return success(null, goods);
	}

}
