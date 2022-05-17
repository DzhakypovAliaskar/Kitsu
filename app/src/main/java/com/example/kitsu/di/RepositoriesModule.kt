package com.example.kitsu.di

import com.example.kitsu.data.repositories.AnimeRepositoryImpl
import com.example.kitsu.data.repositories.AuthenticationRepositoryImpl
import com.example.kitsu.data.repositories.MangaRepositoryImpl
import com.example.kitsu.domain.repositories.AnimeRepository
import com.example.kitsu.domain.repositories.AuthenticationRepository
import com.example.kitsu.domain.repositories.MangaRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {


    @Binds
    abstract fun provideAnimeRepository(animeRepositoryImpl: AnimeRepositoryImpl): AnimeRepository

    @Binds
    abstract fun provideMangaRepository(mangaRepositoryImpl: MangaRepositoryImpl): MangaRepository

    @Binds
    abstract  fun provideAuthenticationApiService(authenticationRepositoryImpl: AuthenticationRepositoryImpl) : AuthenticationRepository
}