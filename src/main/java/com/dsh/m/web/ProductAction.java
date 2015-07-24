package com.dsh.m.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.dsh.m.dao.CustomerGoodsMapper;
import com.dsh.m.dao.GoodsMapper;
import com.dsh.m.dao.GoodsSclassMapper;
import com.dsh.m.model.CustomerGoods;
import com.dsh.m.model.CustomerGoodsExample;
import com.dsh.m.model.Goods;
import com.dsh.m.model.GoodsExample;
import com.dsh.m.model.GoodsSclass;
import com.dsh.m.model.GoodsSclassExample;
import com.dsh.m.service.ShoppingCartService;

@RequestMapping("/product")
@Controller
public class ProductAction extends BaseAction {
	
	@Autowired
	private GoodsMapper goodsMapper;
	@Autowired
	private GoodsSclassMapper goodsSclassMapper;
	@Autowired
	private CustomerGoodsMapper customerGoodsMapper;
	@Autowired
	private ShoppingCartService shoppingCartService;
	
	@RequestMapping
	public String index(Integer catid, ModelMap model, HttpSession session) {
		Integer userid = super.getUserId(session);
		//传入二级分类
		GoodsExample goodsExample = new GoodsExample();
		goodsExample.createCriteria().andSclassidEqualTo(catid);
		List<Goods> goods = goodsMapper.selectByExample(goodsExample);
		
		GoodsSclassExample goodsSclassExample = new GoodsSclassExample();
		goodsSclassExample.createCriteria().andSclassidEqualTo(catid);
		GoodsSclass sclass = goodsSclassMapper.selectByPrimaryKey(catid);
		Integer bclassid = sclass.getBclassid();
		goodsSclassExample = new GoodsSclassExample();
		goodsSclassExample.createCriteria().andBclassidEqualTo(bclassid);
		List<GoodsSclass> cats = goodsSclassMapper.selectByExample(goodsSclassExample);
		
		model.addAttribute("goods", goods);
		model.addAttribute("cats", cats);
		model.addAttribute("num", shoppingCartService.getCartNum(userid));
		return "product/index";
	}
	
	@ResponseBody
	@RequestMapping("/load")
	public String load(Integer catid) {
		GoodsExample goodsExample = new GoodsExample();
		goodsExample.createCriteria().andSclassidEqualTo(catid);
		List<Goods> goods = goodsMapper.selectByExample(goodsExample);
		return JSON.toJSONString(goods);
	}
	
	@RequestMapping("/common")
	public String common(HttpSession session, ModelMap model) {
		Integer userid = super.getUserId(session);
		CustomerGoodsExample example = new CustomerGoodsExample();
		example.createCriteria().andCustomeridEqualTo(userid);
		example.setOrderByClause("count, lastdate desc");
		List<CustomerGoods> list = customerGoodsMapper.selectByExample(example);
		model.addAttribute("products", list);
		model.addAttribute("num", shoppingCartService.getCartNum(userid));
		return "product/common";
	}
	
	@RequestMapping("/search")
	public String search(HttpSession session, String word, ModelMap model) {
		GoodsExample example = new GoodsExample();
		example.createCriteria().andGnameLike("%"+word+"%");
		List<Goods> list = goodsMapper.selectByExample(example);
		model.addAttribute("products", list);
		Integer userid = super.getUserId(session);
		model.addAttribute("num", shoppingCartService.getCartNum(userid));
		return "product/search";
	}
	
}
