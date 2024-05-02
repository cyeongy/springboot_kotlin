package com.sample.mysite.security.repository

import com.sample.mysite.security.entity.CustomUser
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<CustomUser, Long> {
	fun findByUsername(username: String): CustomUser?
}
