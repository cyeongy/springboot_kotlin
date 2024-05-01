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
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	var id: Long = 0L,

	@Column(nullable = false)
	var title: String,

	var description: String?
) {

	fun toDTO(): BookDTO {
		return BookDTO(title = this.title, description = this.description)
	}
}
