package com.dsh.m.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dsh.m.dao.IndexDateMapper;
import com.dsh.m.model.IndexDateExample;

@RequestMapping("/index")
@Controller
public class IndexNumberAction extends BaseAction {
	
	@Autowired
	private IndexDateMapper indexDateMapper;
	
	@RequestMapping("/list")
	public String list(HttpSession session) {
		IndexDateExample ide = new IndexDateExample();
		Integer userid = super.getUserId(session);
		ide.createCriteria().andCustomeridEqualTo(userid);
		indexDateMapper.selectByExample(ide);
		return "index/list";
	}

}
