package com.sample.mysite.security.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

@Entity
class CustomUser(
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	var id: Long = 0L,

	@Column(nullable = false, name = "username")
	private val username: String,
	@Column(nullable = false, name = "password")
	private val password: String,
	private val authorities: List<GrantedAuthority>? = null
) : UserDetails {
	override fun getAuthorities(): List<GrantedAuthority>? = authorities
	override fun getPassword(): String = password
	override fun getUsername(): String = username
	override fun isAccountNonExpired(): Boolean = true
	override fun isAccountNonLocked(): Boolean = true
	override fun isCredentialsNonExpired(): Boolean = true
	override fun isEnabled(): Boolean = true
}
