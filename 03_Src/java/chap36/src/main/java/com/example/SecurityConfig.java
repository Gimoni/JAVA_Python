package com.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.servlet.DispatcherType;

@Configuration
public class SecurityConfig {

	public SecurityConfig() {
		System.out.println("SecurityConfig()...");
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf().disable()
			.cors().disable();
		
		http.authorizeHttpRequests()
			.dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
			.requestMatchers("/webjars/**").permitAll()
			.requestMatchers("/img/**").permitAll()
			.requestMatchers("/admin/**").hasAnyRole("ADMIN")
			.anyRequest().authenticated();
		
		http.formLogin()
			.loginPage("/login")
			.successHandler((request, response, auth) -> {
				response.sendRedirect("/");
			})
			.failureHandler((request, response, e) -> {
				request.setAttribute("exception", e);
				request.getRequestDispatcher("/loginFail");
			})
			.permitAll();
		
		http.logout(Customizer.withDefaults());
		
		System.out.println("filterChain()...");
		
		return http.build();
	}
}
