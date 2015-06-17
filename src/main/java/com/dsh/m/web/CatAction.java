package com.dsh.m.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.dsh.m.dao.GoodsBclassMapper;
import com.dsh.m.dao.GoodsSclassMapper;
import com.dsh.m.model.GoodsBclass;
import com.dsh.m.model.GoodsBclassExample;
import com.dsh.m.model.GoodsSclass;
import com.dsh.m.model.GoodsSclassExample;

@RequestMapping("/cat")
@Controller
public class CatAction extends BaseAction {
	
	@Autowired
	private GoodsBclassMapper goodsBclassMapper;
	@Autowired
	private GoodsSclassMapper goodsSclassMapper;
	
	@RequestMapping
	public String index(ModelMap model) {
		List<GoodsBclass> firstcats = goodsBclassMapper.selectByExample(new GoodsBclassExample());
		
		Integer catid = firstcats.get(0).getBclassid();
		GoodsSclassExample goodsSclassExample = new GoodsSclassExample();
		goodsSclassExample.createCriteria().andBclassidEqualTo(catid);
		List<GoodsSclass> secondcats = goodsSclassMapper.selectByExample(goodsSclassExample);
		
		model.addAttribute("firstcats", firstcats);
		model.addAttribute("secondcats", secondcats);
		return "cat/index";
	}
	
	@ResponseBody
	@RequestMapping("/load")
	public String load(Integer catid) {
		GoodsSclassExample goodsSclassExample = new GoodsSclassExample();
		goodsSclassExample.createCriteria().andBclassidEqualTo(catid);
		List<GoodsSclass> secondcats = goodsSclassMapper.selectByExample(goodsSclassExample);
		return JSON.toJSONString(secondcats);
	}

}
