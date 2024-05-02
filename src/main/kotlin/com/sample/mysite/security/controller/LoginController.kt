package com.sample.mysite.security.controller

import com.sample.mysite.security.dto.CustomUserDTO
import com.sample.mysite.security.service.CustomUserDetailsService
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@Controller
class LoginController(val userService: CustomUserDetailsService) {
	val log = LoggerFactory.getLogger(this.javaClass)

	@GetMapping("/login")
	fun login(): String {
		return "login"
	}

	@PostMapping("/login")
	fun login(@RequestBody body: CustomUserDTO): String {
		log.info("login: ${body.username}, ${body.password}")
		return "login"
	}
}
