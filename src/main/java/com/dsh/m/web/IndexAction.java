package com.dsh.m.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class IndexAction {
	
	@RequestMapping
	public String index() {
		return "redirect:/user";
	}

}
