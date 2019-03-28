package com.cn.demo.view.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import org.springframework.core.annotation.Order;

@WebFilter(filterName="loginFilter", urlPatterns="/*")
@Order(value=1)
public class LoginFilter implements Filter{
	
	@SuppressWarnings("unused")
	private FilterConfig config;
	

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		this.config = filterConfig;
	}


	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		chain.doFilter(request, response);
	}

	
	@Override
	public void destroy() {
		
		this.config = null;
	}
	
}
