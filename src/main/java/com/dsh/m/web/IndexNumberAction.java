package com.dsh.m.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.dsh.m.dao.IndexDateMapper;
import com.dsh.m.model.IndexDate;
import com.dsh.m.model.IndexDateExample;

@RequestMapping("/index")
@Controller
public class IndexNumberAction extends BaseAction {
	
	@Autowired
	private IndexDateMapper indexDateMapper;
	
	@RequestMapping("/list")
	public String list(HttpSession session, ModelMap model) {
		jetbrick.bean.asm.AsmFactory.setThreshold(Integer.MAX_VALUE);
		jetbrick.bean.asm.AsmFactory.setDebugEnabled(true);
		IndexDateExample ide = new IndexDateExample();
		Integer userid = super.getUserId(session);
		ide.createCriteria().andCustomeridEqualTo(userid);
		ide.setLimitStart(0);
		ide.setLimitEnd(7);
		ide.setOrderByClause("indextime desc");
		List<IndexDate> indexs = indexDateMapper.selectByExample(ide);
		model.addAttribute("indexs", JSON.parse(JSON.toJSONStringWithDateFormat(indexs, "yyyy-MM-dd")));
		return "index/list";
	}

}
