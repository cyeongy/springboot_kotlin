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
	@NotNull
	@Id
	var id: Long,

	@NotNull
	var title: String

) {
	fun toDomain(): Book {
		return Book(id = this.id, title = this.title)
	}
}
