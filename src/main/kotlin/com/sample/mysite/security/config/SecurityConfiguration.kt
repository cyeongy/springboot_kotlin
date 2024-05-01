package com.sample.mysite.security.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
class SecurityConfiguration {
	@Bean
	fun filterChain(http: HttpSecurity): SecurityFilterChain {
		http.authorizeHttpRequests { authorize ->
			authorize.requestMatchers("/register", "/login").permitAll().anyRequest().authenticated()
		}.csrf { csrf ->
			csrf.disable()
		}.formLogin { form ->
			form.loginPage("/login")
				.loginProcessingUrl("/auth")
				.usernameParameter("username")
				.passwordParameter("password")
				.defaultSuccessUrl("/")
		}.logout { form ->
			form.logoutUrl("/logout")
				.logoutSuccessUrl("/")
		}

		return http.build()
	}
}
