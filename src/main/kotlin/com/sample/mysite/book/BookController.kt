package com.sample.mysite.book

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController(val bookService: BookService) {
	@GetMapping("/books")
	fun getBooks(): List<BookDTO>? {
		var bookDTOs: List<BookDTO> = bookService.getBooks().map { bookStream: Book ->
			BookDTO(title = bookStream.title, description = bookStream.description)
		}.toList()
		return bookDTOs
	}

	@GetMapping("/books/{id}")
	fun getBook(@PathVariable id: Long): BookDTO? {
		if (bookService.getBookById(id) == null) {
			return null
		} else {
			return bookService.getBookById(id)!!.toDTO()
		}
	}

	@PostMapping("/books")
	fun addBook(@RequestBody book: BookDTO): Long? {
		println(book)
		return bookService.save(book)
	}
}
