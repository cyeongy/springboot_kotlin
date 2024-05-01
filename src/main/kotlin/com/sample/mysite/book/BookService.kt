package com.sample.mysite.book

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class BookService(val bookRepository: BookRepository) {
	fun save(bookDTO: BookDTO): Long? {
		return bookRepository.save(bookDTO.toEntity()).id
	}

	fun getBookById(id: Long): Book? {
		return bookRepository.findByIdOrNull(id)
	}

	fun getBooks(): List<Book> {
		return bookRepository.findAll()
	}
}
