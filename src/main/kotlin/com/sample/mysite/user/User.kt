package com.sample.mysite.user

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class User(
	@jakarta.persistence.Id
	@get:GeneratedValue(strategy = GenerationType.AUTO)
	var id: Long,

	var userId: String,
	var password: String
)
