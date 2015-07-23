package com.dsh.m.web;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.dsh.m.dao.IndexDateChildMapper;
import com.dsh.m.dao.IndexDateMapper;
import com.dsh.m.model.IndexDate;
import com.dsh.m.model.IndexDateChild;
import com.dsh.m.model.IndexDateChildExample;
import com.dsh.m.model.IndexDateExample;

@RequestMapping("/index")
@Controller
public class IndexNumberAction extends BaseAction {
	
	@Autowired
	private IndexDateMapper indexDateMapper;
	@Autowired
	private IndexDateChildMapper indexDateChildMapper;
	
	@RequestMapping("/list")
	public String list(HttpSession session, ModelMap model) {
		IndexDateExample ide = new IndexDateExample();
		Integer userid = super.getUserId(session);
		ide.createCriteria().andCustomeridEqualTo(userid).andT1GreaterThan(new BigDecimal(0));
		ide.setLimitStart(0);
		ide.setLimitEnd(7);
		ide.setOrderByClause("indextime desc");
		List<IndexDate> indexs = indexDateMapper.selectByExample(ide);
		model.addAttribute("indexs", JSON.parse(JSON.toJSONStringWithDateFormat(indexs, "yyyy-MM-dd")));
		return "index/list";
	}
	
	@RequestMapping("/detail")
	public String detail(HttpSession session,Integer id, ModelMap model) {
		IndexDate index = null;
		if(id==null) {
			IndexDateExample example = new IndexDateExample();
			example.setOrderByClause("id desc");
			example.setLimitStart(0);
			example.setLimitEnd(1);
			example.createCriteria().andCustomeridEqualTo(super.getUserId(session)).andT1GreaterThan(new BigDecimal(0));
			List<IndexDate> indexs = indexDateMapper.selectByExample(example);
			index = indexs.get(0);
			id = index.getId();
		} else {
			index = indexDateMapper.selectByPrimaryKey(id);
		}
		IndexDateChildExample childExample = new IndexDateChildExample();
		childExample.createCriteria().andIndexDateIdEqualTo(id).andT8GreaterThan(0).andDrEqualTo("1");
			
		List<IndexDateChild> childs = indexDateChildMapper.selectByExample(childExample);
		model.addAttribute("index", JSON.parse(JSON.toJSONStringWithDateFormat(index, "yyyy年MM月dd日")));
		model.addAttribute("childs", childs);
		return "index/detail";
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("/warn")
	public String warn(HttpSession session, ModelMap model) {
		Map param = new HashMap();
		param.put("start", 0);
		param.put("pagesize", 7);
		param.put("userid", super.getUserId(session));
		Map data = indexDateMapper.summaryIndexDate(param);
		Date mintime = (Date)data.get("indextime");
		param.put("indextime", mintime);
		
		BigDecimal amount = indexDateMapper.getTotalMinusAmount(param);
		model.addAttribute("amount", amount);
		List childs = indexDateChildMapper.getIndexDateChilds(param);
		
		model.addAttribute("data", data);
		model.addAttribute("childs", childs);
		return "index/warn";
	}

}
