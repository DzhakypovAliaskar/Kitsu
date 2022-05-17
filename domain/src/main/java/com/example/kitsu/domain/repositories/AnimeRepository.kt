package com.example.kitsu.domain.repositories

import com.example.kitsu.domain.either.Either
import com.example.kitsu.domain.models.anime.SingleAnimeModel
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {

    fun fetchAnime(id: String): Flow<Either<String, SingleAnimeModel>>
}