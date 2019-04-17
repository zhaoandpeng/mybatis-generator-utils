package com.cn.demo.view.redis;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RestController;

import cn.apiclub.captcha.Captcha;
import cn.apiclub.captcha.backgrounds.GradiatedBackgroundProducer;
import cn.apiclub.captcha.gimpy.FishEyeGimpyRenderer;

@RestController
public class SpringRedisCaptchaCode {

	@Resource
	private RedisTemplate<String, String> redisTemplate;
	
	private static int captchaW = 200; 
	  
	private static int captchaH = 60; 
	
	public String readCaptchaCode() {
		
		String uuid = UUID.randomUUID().toString();
		Captcha captcha = new Captcha.Builder(captchaW, captchaH) 
		        .addText()  .addBackground(new GradiatedBackgroundProducer()) 
		        .gimp(new FishEyeGimpyRenderer()) 
		        .build();
		redisTemplate.opsForValue().set(uuid, captcha.getAnswer(), 1*60, TimeUnit.SECONDS);
		
		
	}
	
}
