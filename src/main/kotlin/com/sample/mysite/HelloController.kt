package com.sample.mysite

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {

	@GetMapping("/")
	fun index(model: Model): String {
		model.addAttribute("message", "this is mustache")
		return "index"
	}
}
