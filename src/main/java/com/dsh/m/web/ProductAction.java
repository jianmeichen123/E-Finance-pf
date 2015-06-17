package com.dsh.m.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dsh.m.dao.GoodsMapper;
import com.dsh.m.dao.GoodsSclassMapper;
import com.dsh.m.model.Goods;
import com.dsh.m.model.GoodsExample;
import com.dsh.m.model.GoodsSclass;
import com.dsh.m.model.GoodsSclassExample;

@RequestMapping("/product")
@Controller
public class ProductAction extends BaseAction {
	
	@Autowired
	private GoodsMapper goodsMapper;
	@Autowired
	private GoodsSclassMapper goodsSclassMapper;
	
	@RequestMapping("/list")
	public String list(Integer secid, ModelMap model) {
		//传入二级分类
		GoodsExample goodsExample = new GoodsExample();
		goodsExample.createCriteria().andSclassidEqualTo(secid);
		List<Goods> goods = goodsMapper.selectByExample(goodsExample);
		
		GoodsSclassExample goodsSclassExample = new GoodsSclassExample();
		List<GoodsSclass> cats = goodsSclassMapper.selectByExample(goodsSclassExample);
		
		model.addAttribute("goods", goods);
		model.addAttribute("cats", cats);
		return "product/list";
	}

}
