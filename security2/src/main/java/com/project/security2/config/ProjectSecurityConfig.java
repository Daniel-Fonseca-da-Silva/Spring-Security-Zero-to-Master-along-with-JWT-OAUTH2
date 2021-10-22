package com.project.security2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ProjectSecurityConfig extends WebSecurityConfigurerAdapter {
	
	//	This don't working with postman! only browser!
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//	        .antMatchers("/myAccount").authenticated()
//	        .antMatchers("/myBalance").authenticated()
//	        .antMatchers("/myLoans").authenticated()
//	        .antMatchers("/myCards").authenticated()
//	        .antMatchers("/notices").permitAll()
//	        .antMatchers("/contact").permitAll()
//        .and()
//        .formLogin()
//        .and()
//        .httpBasic();
    	
    	http .authorizeRequests()
    	.anyRequest().denyAll()
    	.and()
    	.formLogin().and() .httpBasic();
    	
    }
	
}