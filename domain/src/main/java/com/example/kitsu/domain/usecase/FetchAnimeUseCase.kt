package com.example.kitsu.domain.usecase

import com.example.kitsu.domain.repositories.AnimeRepository
import javax.inject.Inject

class FetchAnimeUseCase @Inject constructor(private val repository: AnimeRepository) {
    operator fun invoke(id:String) = repository.fetchAnime(id )
}