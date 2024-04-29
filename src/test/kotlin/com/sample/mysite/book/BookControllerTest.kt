package com.sample.mysite.book

import org.junit.jupiter.api.Test
import org.mockito.BDDMockito.given
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(controllers = [BookController::class])
class BookControllerTest {

	@Autowired
	private lateinit var mockMvc: MockMvc

	@MockBean
	private lateinit var bookService: BookService

	@Test
	fun getBooks() {
		given(bookService.getBookById(123))
			.willReturn(Book(id = 123, title = "파이썬으로 하는 데브옵스", description = "test"))

		var bookId: Long = 123

		mockMvc.perform(get("/books/$bookId"))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.id").value(bookId))
			.andExpect(jsonPath("$.title").value("파이썬으로 하는 데브옵스"))
			.andExpect(jsonPath("$.description").exists())
			.andDo(print())
	}

	@Test
	fun getBook() {
	}

	@Test
	fun addBook() {
	}

	@Test
	fun getBookService() {
	}
}
