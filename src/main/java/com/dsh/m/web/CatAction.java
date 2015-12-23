package com.dsh.m.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.dsh.m.dao.GoodsCategoryMapper;
import com.dsh.m.model.GoodsCategory;
import com.dsh.m.model.GoodsCategoryExample;

@RequestMapping("/cat")
@Controller
public class CatAction extends BaseAction {
	
//	@Autowired
//	private GoodsBclassMapper goodsBclassMapper;
//	@Autowired
//	private GoodsSclassMapper goodsSclassMapper;
	@Autowired
	private GoodsCategoryMapper goodsCategoryMapper;
	
	@RequestMapping
	public String index(ModelMap model) {
//		GoodsBclassExample goodsBclassExample = new GoodsBclassExample();
//		goodsBclassExample.createCriteria().andBclassidNotEqualTo(28).andIsSaleEqualTo("1");
//		List<GoodsBclass> firstcats = goodsBclassMapper.selectByExample(goodsBclassExample);
//		
//		Integer catid = firstcats.get(0).getBclassid();
//		GoodsSclassExample goodsSclassExample = new GoodsSclassExample();
//		goodsSclassExample.createCriteria().andBclassidEqualTo(catid).andIsSaleEqualTo("1");
//		List<GoodsSclass> secondcats = goodsSclassMapper.selectByExample(goodsSclassExample);
		
		GoodsCategoryExample goodsCategoryExample = new GoodsCategoryExample();
		goodsCategoryExample.createCriteria().andIdNotEqualTo(28).andIsSaleEqualTo(true).andParentIdEqualTo(0);
		List<GoodsCategory> firstcats = goodsCategoryMapper.selectByExample(goodsCategoryExample);
		
		Integer id = firstcats.get(0).getId();
		goodsCategoryExample.clear();
		goodsCategoryExample.createCriteria().andParentIdEqualTo(id).andIsSaleEqualTo(true);
		List<GoodsCategory> secondcats = goodsCategoryMapper.selectByExample(goodsCategoryExample);
		
		model.addAttribute("firstcats", firstcats);
		model.addAttribute("secondcats", secondcats);
		return "cat/index";
	}
	
	@ResponseBody
	@RequestMapping("/load")
	public String load(Integer catid) {
//		GoodsSclassExample goodsSclassExample = new GoodsSclassExample();
//		goodsSclassExample.createCriteria().andBclassidEqualTo(catid).andIsSaleEqualTo("1");
//		List<GoodsSclass> secondcats = goodsSclassMapper.selectByExample(goodsSclassExample);
		
		GoodsCategoryExample goodsCategoryExample = new GoodsCategoryExample();
		goodsCategoryExample.createCriteria().andParentIdEqualTo(catid).andIsSaleEqualTo(true);
		List<GoodsCategory> secondcats = goodsCategoryMapper.selectByExample(goodsCategoryExample);
		return JSON.toJSONString(secondcats);
	}

}
