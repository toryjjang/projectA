package com.tory.toryProjectA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tory.toryProjectA.service.MemberService;

@Controller
public class HelloController{
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/test")
	public String test(Model model) {
	//return "";
		
		String name = memberService.getUserName();
		model.addAttribute("name", name);
		return "/test";
		
	}
}
