package com.cn.demo.view.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.demo.view.service.BaseUserService;

@Controller
public class LoginController{

	
	@Resource
	private BaseUserService baseUserService;
	
	/**
	 * <p>Method: index</p>  
	 * <p>Description: 登录页 </p>  
	 */
	@RequestMapping(value="/index")
	public String index() {
		
		return "index";
		
	}
	
	
	@GetMapping(value="/login")
	public String login() {
		
		
		return "main/main";
	}
	
	
	@RequestMapping(value="/main")
	public String home() {
		System.out.println("homehomehomehomehomehomehomehomehomehomehomehomehomehome");
		
		
		return "main/main";
		
	}
	
}
