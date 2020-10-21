package com.guren.fastingapp.repository

import com.guren.fastingapp.network.AuthApi

class AuthRepository (
        private val api: AuthApi
) : BaseRepository(){

    suspend fun login(
            email:String,
            password:String
    ) = safeApi {
        api.login(email,password)
    }
}