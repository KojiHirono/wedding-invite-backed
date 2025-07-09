package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
			.csrf(csrf -> csrf.disable()) //CSRF保護を無効化（API用）
			.authorizeHttpRequests(auth -> auth
					.requestMatchers("/api/**").permitAll() // APIは認証不要
					.anyRequest().authenticated()
			)
			.formLogin(form -> form.disable()) // ログイン画面不要 
			.httpBasic(basic -> basic.disable()); // Basic認証不要
		
		return http.build();
	}
}
