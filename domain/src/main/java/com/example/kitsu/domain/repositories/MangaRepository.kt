package com.example.kitsu.domain.repositories

import com.example.kitsu.domain.either.Either
import com.example.kitsu.domain.models.manga.SingleMangaModel
import kotlinx.coroutines.flow.Flow

interface MangaRepository {
    fun fetchManga(id: String): Flow<Either<String, SingleMangaModel>>

}