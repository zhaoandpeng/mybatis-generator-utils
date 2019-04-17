package com.cn.demo.view.redis;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
@Configuration
@EnableCaching
public class SpringRedisConfig extends CachingConfigurerSupport{

	@Bean
	public RedisConnectionFactory redisFactory() {
		
		return new LettuceConnectionFactory();
	}
	
	@Bean
	public RedisTemplate<String, String> redisTemplate(){
		
		RedisTemplate<String, String> redisTemplate = new RedisTemplate<String, String>();
		
		redisTemplate.setConnectionFactory(redisFactory());
		
//		System.out.println(redisTemplate.getConnectionFactory().getConnection().getClientName());
		
		return redisTemplate;
	}
	
}
