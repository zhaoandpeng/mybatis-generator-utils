package com.cn.demo.view.security;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter  {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable()
				.authorizeRequests()
				.antMatchers("/login","/image/**","/css/**","/layui*/**").permitAll()
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
	 
	 
	 
	/*static class UserService implements UserDetailsService{

		@Override
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			
			User user = new User("1", "1", null);
			
			return user;
		}
		
	}*/
	
	
}
