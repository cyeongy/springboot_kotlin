package com.sample.mysite.security.service

import com.sample.mysite.security.dto.CustomUserDTO
import com.sample.mysite.security.entity.CustomUser
import com.sample.mysite.security.repository.UserRepository
import org.slf4j.LoggerFactory
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class CustomUserDetailsService(val userRepository: UserRepository) : UserDetailsService {
	val log = LoggerFactory.getLogger(this.javaClass)
	override fun loadUserByUsername(username: String?): UserDetails {
		log.info("Loading user by username: $username")
		val userDetails: UserDetails? = userRepository.findByUsername(username!!)
		val authorities = userDetails!!.authorities

		return userDetails
	}

	fun save(userDto: CustomUserDTO): CustomUser {
		var user: CustomUser = CustomUser(username = userDto.username, password = userDto.password)
		return userRepository.save(user)
	}
}
