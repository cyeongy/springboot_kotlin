package com.sample.mysite.security.dto

import jakarta.validation.constraints.NotNull
import lombok.Data

@Data
class CustomUserDTO(
	@NotNull
	var username: String,
	var password: String
) {
}
