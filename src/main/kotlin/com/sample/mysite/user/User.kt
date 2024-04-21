package com.sample.mysite.user

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Getter
import lombok.NoArgsConstructor

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var index: Long? = null
    var username: String? = null
    var password: String? = null
}