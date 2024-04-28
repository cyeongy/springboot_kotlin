package com.sample.mysite.book

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController(val bookService: BookService) {
	@GetMapping("/books")
	fun getBooks(): List<Book>? {
		return bookService.getBooks()
	}

	@GetMapping("/books/{id}")
	fun getBook(@PathVariable id: Long): Book? {
		return bookService.getBookById(id)
	}

	@PostMapping("/books")
	fun addBook(@RequestBody book: Book): Long? {
		return bookService.save(book.toDTO())
	}
}
