package com.sample.mysite

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@Controller
class HelloController {

	@GetMapping("/")
	fun index(model: Model): String {
		return "index"
	}

	@GetMapping("/{user}")
	fun hello(@PathVariable user: String): String {
		return "Hello $user"
	}
}
