package com.sample.mysite.book

import org.springframework.data.repository.findByIdOrNull

// @Service
class BookDAO(val bookRepository: BookRepository) {
	fun saveBook(book: Book): Any {
		return bookRepository.save(book)
	}

	fun getBookById(id: Long): Book? {
		return bookRepository.findByIdOrNull(id)
	}

	fun getBooks(): List<Book> {
		return bookRepository.findAll()
	}
}
