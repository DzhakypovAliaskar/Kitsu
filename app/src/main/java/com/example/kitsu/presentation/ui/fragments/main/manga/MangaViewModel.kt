package com.example.kitsu.presentation.ui.fragments.main.manga

import com.example.kitsu.data.repositories.MangaRepositoryImpl
import com.example.kitsu.presentation.base.BaseViewModel
import com.example.kitsu.presentation.models.manga.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class MangaViewModel @Inject constructor(
    private val mangaRepositoryImpl: MangaRepositoryImpl

) : BaseViewModel() {
    fun fetchManga() = mangaRepositoryImpl.fetchPageManga().gatherPagingRequest { it.toUI() }
}