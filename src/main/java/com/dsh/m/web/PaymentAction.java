package com.dsh.m.web;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dsh.m.dao.PayAppointMapper;
import com.dsh.m.model.Customer;
import com.dsh.m.model.PayAppoint;
import com.dsh.m.util.PasswordUtil;

@RequestMapping("/payment")
@Controller
public class PaymentAction extends BaseAction {
	@Autowired
	private PayAppointMapper paymentMapper;
	@Autowired
	private PayAppointMapper PayBaseMapper;
	
	@ResponseBody
	@RequestMapping("/reg")
	public String reg(PayAppoint payPppiont) {
		
		
		
		
		return "success";
	}
	
	@RequestMapping("tosign")
	public String signing() {
		return "account/signing";
	}
	
	@RequestMapping("appoint")
	@ResponseBody
	public String appoint(HttpServletRequest request, PayAppoint payAppoint){
		
		return "";
	}
	

}
