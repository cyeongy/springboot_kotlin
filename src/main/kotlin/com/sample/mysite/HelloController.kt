package com.sample.mysite

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
	@GetMapping("/")
	fun hello(): String {
		return "Hello World!"
	}

	@GetMapping("/{user}")
	fun hello(@PathVariable user: String): String {
		return "Hello $user"
	}
}
