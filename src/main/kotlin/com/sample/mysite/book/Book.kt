package com.sample.mysite.book

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "book")
class Book(
	@get:Id
	@get:GeneratedValue(strategy = GenerationType.IDENTITY)
	var id: Long,

	@get:Column(nullable = false)
	var title: String
) {
	fun toDTO(): BookDTO {
		return BookDTO(id = this.id, title = this.title)
	}
}
