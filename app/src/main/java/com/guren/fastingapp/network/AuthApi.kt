package com.guren.fastingapp.network

import com.guren.fastingapp.responses.LoginResponse
import retrofit2.http.Field
import retrofit2.http.POST
import retrofit2.http.FormUrlEncoded

interface AuthApi{

    @FormUrlEncoded
    @POST
    suspend fun login(
        @Field("email") email: String,
        @Field("password") password: String
    ): LoginResponse
}