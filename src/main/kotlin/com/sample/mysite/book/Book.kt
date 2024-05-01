package com.sample.mysite.book

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.jetbrains.annotations.NotNull

@Entity
@Table(name = "book")
class Book(
	@get:Id
	@get:GeneratedValue(strategy = GenerationType.IDENTITY)
	var id: Long = 0L,

	@get:NotNull
	var title: String,

	var description: String?
) {

	fun toDTO(): BookDTO {
		return BookDTO(title = this.title, description = this.description)
	}
}
