package com.sample.mysite.book

import lombok.Builder
import lombok.Data
import lombok.Getter
import org.jetbrains.annotations.NotNull

@Data
@Builder
@Getter
class BookDTO(
	@get:NotNull
	var title: String,

	var description: String?
) {
	fun toEntity(): Book {
		return Book(title = this.title, description = this.description)
	}
}
