package com.dsh.m.web;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.dsh.m.dao.CustomerMapper;
import com.dsh.m.dao.IndexDateMapper;
import com.dsh.m.model.Customer;
import com.dsh.m.model.CustomerExample;
import com.dsh.m.model.IndexDate;
import com.dsh.m.model.IndexDateExample;
import com.dsh.m.service.CustomerService;
import com.dsh.m.util.PasswordUtil;

@RequestMapping("/user")
@Controller
public class UserAction extends BaseAction {
	
	@Autowired
	private CustomerMapper customerMapper;
	@Autowired
	private IndexDateMapper indexDateMapper;
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/toreg")
	public String toreg() {
		return "user/reg";
	}
	
	@ResponseBody
	@RequestMapping("/reg")
	public String reg(String loginname, String loginpass, String telephone) {
		try {
			loginpass = PasswordUtil.encript(loginpass);
			Customer customer = new Customer();
			customer.setLoginname(loginname);
			customer.setLoginpass(loginpass);
			customer.setTelephone(telephone);
			customer.setRegisterTime(new Date());
			customerMapper.insertSelective(customer);
			return success("注册成功！！");
		} catch (Exception e) {
			e.printStackTrace();
			return fail("注册失败！！");
		}
	}
	
	@RequestMapping("/tologin")
	public String tologin() {
		return "user/login";
	}
	
	@ResponseBody
	@RequestMapping("/login")
	public String login(String loginname, String loginpass, HttpSession session) {
		loginpass = PasswordUtil.encript(loginpass);
		CustomerExample customerExample = new CustomerExample();
		customerExample.createCriteria().andLoginnameEqualTo(loginname).andLoginpassEqualTo(loginpass);
		List<Customer> customers = customerMapper.selectByExample(customerExample);
		if(CollectionUtils.isNotEmpty(customers)) {
			session.setAttribute("login_id", customers.get(0).getCusid());
			return success("登陆成功！！");
		} else {
			return fail("用户名或密码错误！！");
		}
	}
	
	@RequestMapping
	public String index(ModelMap model, HttpSession session) {
		IndexDateExample example = new IndexDateExample();
		example.setOrderByClause("id desc");
		example.setLimitStart(0);
		example.setLimitEnd(1);
		example.createCriteria().andCustomeridEqualTo(super.getUserId(session)).andT1GreaterThan(new BigDecimal(0));
		List<IndexDate> indexs = indexDateMapper.selectByExample(example);
		if(CollectionUtils.isNotEmpty(indexs)) {
			IndexDate index = indexs.get(0);
			model.addAttribute("index", JSON.parse(JSON.toJSONStringWithDateFormat(index, "yyyy年MM月dd日")));
		}
		return "user/index";
	}
	
	@RequestMapping("/setting")
	public String setting(HttpSession session, ModelMap model) {
		Customer customer = customerMapper.selectByPrimaryKey(super.getUserId(session));
		model.addAttribute("user", customer);
		return "user/setting";
	}
	
	@ResponseBody
	@RequestMapping("/fetch")
	public String fetch(HttpSession session) {
		Customer customer = customerService.getCacheCustomerById(super.getUserId(session));
		return JSON.toJSONString(customer);
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("login_id");
		return "已注销";
	}

}
