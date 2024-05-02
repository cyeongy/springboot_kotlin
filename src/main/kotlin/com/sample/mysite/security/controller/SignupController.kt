package com.sample.mysite.security.controller

import com.sample.mysite.security.dto.CustomUserDTO
import com.sample.mysite.security.service.CustomUserDetailsService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

@Controller
class SignupController(val userService: CustomUserDetailsService) {
	@GetMapping("/register")
	fun signupForm(model: Model): String {
		return "register"
	}

	@PostMapping("/register")
	fun signup(@ModelAttribute user: CustomUserDTO): String {
		userService.save(user)
		return "redirect:/login"
	}
}
