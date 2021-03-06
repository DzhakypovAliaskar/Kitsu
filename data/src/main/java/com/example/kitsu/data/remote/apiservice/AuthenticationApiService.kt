package com.example.kitsu.data.remote.apiservice

import com.example.kitsu.data.remote.dtos.auth.AuthDto
import com.example.kitsu.data.remote.dtos.auth.RefreshToken
import com.example.kitsu.data.remote.dtos.auth.TokenDto
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthenticationApiService {
    @POST("token")
    suspend fun authenticate(
        @Body authDto: AuthDto
    ): TokenDto

    @POST("token")
    suspend fun refreshAccessToken(@Body refreshToken: RefreshToken): TokenDto

}