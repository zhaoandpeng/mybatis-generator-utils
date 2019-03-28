package com.cn.demo.view.controller;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.demo.view.service.BaseUserService;

@Controller
public class LoginController{

	
	@Resource
	private BaseUserService baseUserService;
	
	
	@RequestMapping(value="/index")
	public String index() {
		try {
			baseUserService.get("AAA");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "index";
		
	}
	
	
	@RequestMapping(value="/login")
	public void login() {
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		
	}
	
	
	@RequestMapping(value="/main")
	public String home() {
		System.out.println("homehomehomehomehomehomehomehomehomehomehomehomehomehome");
		
		
		return "main/main";
		
	}
	
}
