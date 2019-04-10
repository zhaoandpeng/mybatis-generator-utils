package com.cn.demo.view.security;
import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter  {
	
	
	@Resource
	private LocalUserDetailsService LocalUserDetailsService;
	
	private DaoAuthenticationProvider daoAuthenticationProvider;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable()
				.authorizeRequests()
				.antMatchers("/image/**","/css/**","/layui*/**").permitAll()
				.anyRequest().authenticated()
				.and()
				.formLogin().loginPage("/index")
				.loginProcessingUrl("/login")
				.failureUrl("/index")
				.defaultSuccessUrl("/main")
				.permitAll();
	}

	 @Override
     protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	      auth
	          .inMemoryAuthentication().passwordEncoder(new LocalPasswordEncoder())//.withUser("user").password("password").roles("USER").and()
	          .withUser("admin").password("123456").roles("USER");
     }
	 
	 
	 @Bean
	 public DaoAuthenticationProvider authenticationProvider() {
		 
		 daoAuthenticationProvider = new DaoAuthenticationProvider();
		 
		 daoAuthenticationProvider.setUserDetailsService(LocalUserDetailsService);
		 
//		 daoAuthenticationProvider.se
		 
		 return daoAuthenticationProvider;
	 }
	
	
	
}
