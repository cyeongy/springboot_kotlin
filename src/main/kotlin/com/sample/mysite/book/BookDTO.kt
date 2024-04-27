package com.sample.mysite.book

import jakarta.persistence.Id
import lombok.Builder
import lombok.Data
import lombok.Getter
import org.jetbrains.annotations.NotNull

@Data
@Builder
@Getter
class BookDTO(
	@get:NotNull
	@get:Id
	var id: Long,

	@get:NotNull
	var title: String,

	var description: String?
) {
	fun toDomain(): Book {
		return Book(id = this.id, title = this.title, description = this.description)
	}
}
