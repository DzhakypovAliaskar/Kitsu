package com.example.kitsu.data.repositories

import com.example.kitsu.data.local.preferences.PreferencesHelper
import com.example.kitsu.data.remote.apiservice.AuthenticationApiService
import com.example.kitsu.data.remote.dtos.auth.AuthDto
import com.example.kitsu.data.remote.dtos.auth.toDomain
import com.example.kitsu.data.repositories.base.BaseRepository
import com.example.kitsu.domain.models.auth.TokenModel
import com.example.kitsu.domain.repositories.AuthenticationRepository
import javax.inject.Inject

class AuthenticationRepositoryImpl @Inject constructor(

    private val authenticationApiService: AuthenticationApiService,
    private val preferencesHelper: PreferencesHelper
) : BaseRepository(), AuthenticationRepository {
    override fun authenticate(
        username: String,
        password: String
    ) = sendRequest(this::saveToken) {
        authenticationApiService.authenticate(AuthDto(username = username, password = password))
            .toDomain()
    }

    private fun saveToken(tokenModel: TokenModel) {
        preferencesHelper.accessToken = tokenModel.accessToken
        preferencesHelper.refreshToken = tokenModel.refreshToken
        preferencesHelper.isAuthenticated = true
    }
}