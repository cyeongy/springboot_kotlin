package com.sample.mysite.user

import com.sample.mysite.user.User

interface UserDAO {
    fun saveUser(user: User)
    fun getUser(user: User)
}