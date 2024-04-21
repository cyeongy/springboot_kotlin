package com.sample.mysite

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MysiteApplication

fun main(args: Array<String>) {
	runApplication<MysiteApplication>(*args)
}
