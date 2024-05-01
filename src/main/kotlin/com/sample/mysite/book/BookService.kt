package com.sample.mysite.book

import org.slf4j.LoggerFactory
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class BookService(val bookRepository: BookRepository) {
	private val logger = LoggerFactory.getLogger(BookService::class.java)

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
