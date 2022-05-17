package com.example.kitsu.data.remote

import com.example.kitsu.data.remote.apiservice.AnimeApiService
import com.example.kitsu.data.remote.apiservice.AuthenticationApiService
import com.example.kitsu.data.remote.apiservice.MangaApiService
import retrofit2.Retrofit
import javax.inject.Inject

class NetworkClient @Inject constructor(
    retrofitClient: NetworkFastBuilder,
    okHttp: OkHttp
) {
    private val retrofit = retrofitClient.provideRetrofit(okHttp.provideOkHttpClient())
    fun provideAnimeApiService(): AnimeApiService = retrofit.createAnApi()
    fun provideMangaApiService(): MangaApiService = retrofit.createAnApi()

    class AuthenticationClient @Inject constructor(
        retrofitClient: NetworkFastBuilder,
        okHttp: OkHttp
    ) {
        private val retrofit =
            retrofitClient.provideAuthenticationRetrofit(okHttp.provideOkHttpClient())

        fun provideAuthenticationApiService(): AuthenticationApiService = retrofit.createAnApi()
    }
}

inline fun <reified T : Any> Retrofit.createAnApi(): T {
    return create(T::class.java)
}