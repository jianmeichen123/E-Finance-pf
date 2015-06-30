package com.dsh.m.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dsh.m.dao.SettleaccountMapper;
import com.dsh.m.dao.SettleaccountchildMapper;
import com.dsh.m.model.Settleaccount;
import com.dsh.m.model.SettleaccountExample;
import com.dsh.m.model.Settleaccountchild;
import com.dsh.m.model.SettleaccountchildExample;

@RequestMapping("/settle")
@Controller
public class SettleAction extends BaseAction {
	
	@Autowired
	private SettleaccountMapper settleaccountMapper;
	@Autowired
	private SettleaccountchildMapper settleaccountchildMapper;
	
	@RequestMapping("/list")
	public String list(HttpSession session, ModelMap model) {
		Integer userid = super.getUserId(session);
		SettleaccountExample example = new SettleaccountExample();
		example.createCriteria().andCustomeridEqualTo(userid);
		List<Settleaccount> settles = settleaccountMapper.selectByExample(example);
		model.addAttribute("settles", settles);
		return "settle/list";
	}
	
	@RequestMapping("/childs")
	public String childs(Integer id, ModelMap model) {
		Settleaccount settle = settleaccountMapper.selectByPrimaryKey(id);
		SettleaccountchildExample example = new SettleaccountchildExample();
		example.createCriteria().andSettleidEqualTo(id);
		List<Settleaccountchild> childs = settleaccountchildMapper.selectByExample(example);
		
		model.addAttribute("settle", settle);
		model.addAttribute("childs", childs);
		return "settle/childs";
	}
	
	@ResponseBody
	@RequestMapping("/confirm")
	public String confirm(Integer id) {
		Settleaccount settle = new Settleaccount();
		settle.setId(id);
		settle.setReturnstateid(1);
		try {
			settleaccountMapper.updateByPrimaryKeySelective(settle);
			return success("确认成功！！");
		} catch (Exception e) {
			e.printStackTrace();
			return fail("确认失败！！");
		}
	}
	
}
