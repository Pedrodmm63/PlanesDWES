package com.spring.tutoriasEDU.seguridad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeRequests(authorize -> authorize
                .requestMatchers("/login", "/resources/**").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .loginPage("/login")
                .defaultSuccessUrl("/plan", true)
                .permitAll()
            )
            .logout(logout -> logout
                .logoutSuccessUrl("/login")
            );
        return http.build();
    }
	
	  @Bean
	    BCryptPasswordEncoder bCryptPasswordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
	  
	  @Bean
	   AuthenticationManager authenticationManager(
			   HttpSecurity http, 
			   BCryptPasswordEncoder bCryptPasswordEncoder, 
			   UserDetailsService userDetailsService) throws Exception {
	       return http.getSharedObject(AuthenticationManagerBuilder.class)
	         .userDetailsService(userDetailsService)
	         .passwordEncoder(bCryptPasswordEncoder)
	         .and()
	         .build();
	   }
}
