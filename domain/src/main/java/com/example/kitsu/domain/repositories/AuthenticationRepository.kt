package com.example.kitsu.domain.repositories

import com.example.kitsu.domain.either.Either
import com.example.kitsu.domain.models.auth.TokenModel
import kotlinx.coroutines.flow.Flow

interface AuthenticationRepository {
    fun authenticate(username: String, password: String): Flow<Either<String, TokenModel>>
}