//package com.DoAnChuyenNganh.UngDungDatVeXemPhim.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
////https://docs.spring.io/spring-security/reference/servlet/architecture.html Tài liệu
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
//		httpSecurity.authorizeHttpRequests(t ->
//		t.requestMatchers(HttpMethod.POST,"/register").permitAll()
//		.anyRequest().authenticated());
//		httpSecurity.csrf(t ->t.disable() );
//        return httpSecurity.build();
//    }
//}
