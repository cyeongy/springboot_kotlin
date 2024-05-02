package com.sample.mysite

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Controller
class CommonController {
	val log = LoggerFactory.getLogger(CommonController::class.java)!!

	@GetMapping("/index", "/", "/index.html")
	fun common(@PathVariable template_name: String = "index", model: Model): String {
		log.info("Index 페이지 진입")
		return "index"
	}
}
