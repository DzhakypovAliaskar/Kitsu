package com.example.kitsu.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.map
import com.example.kitsu.data.remote.apiservice.MangaApiService
import com.example.kitsu.data.remote.dtos.manga.toDomain
import com.example.kitsu.data.remote.pagingsources.MangaPagingSource
import com.example.kitsu.data.repositories.base.BaseRepository
import com.example.kitsu.domain.repositories.MangaRepository
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class MangaRepositoryImpl @Inject constructor(
    private val mangaApiService: MangaApiService
) : BaseRepository(), MangaRepository {

    fun fetchPageManga() = Pager(
        PagingConfig(
            pageSize = 20,
            initialLoadSize = 10
        )
    ) { MangaPagingSource(mangaApiService) }.flow.map { data -> data.map { it.toDomain() } }


    override fun fetchManga(id: String) = sendRequest{
        mangaApiService.fetchMangaes(id).toDomain()

    }
}