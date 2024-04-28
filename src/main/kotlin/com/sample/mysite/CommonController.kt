package com.sample.mysite

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import java.util.regex.Matcher
import java.util.regex.Pattern

@Controller
class CommonController {

	@GetMapping("/{template_name}")
	fun common(@PathVariable template_name: String = "index", model: Model): String {
// 		if (template_name.isEmpty()) {
// 			return "index"
// 		}

		val pattern: Pattern = Pattern.compile("(?<template>.*)\\.html$")
		val matcher: Matcher = pattern.matcher(template_name)
		if (matcher.find()) {
			return matcher.group(1)
		}
		return template_name
	}
}
