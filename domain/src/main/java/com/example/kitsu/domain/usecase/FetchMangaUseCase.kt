package com.example.kitsu.domain.usecase

import com.example.kitsu.domain.repositories.MangaRepository
import javax.inject.Inject

class FetchMangaUseCase @Inject constructor(
    private val mangaRepository: MangaRepository
) {
    operator fun invoke(id:String) = mangaRepository.fetchManga(id)
}