package com.example.dummymovieapp.data.source.remote.network

import com.example.dummymovieapp.data.source.remote.network.services.MovieServices
import com.example.dummymovieapp.data.source.remote.network.services.TvShowServices

class Gate : ApiConfig() {
    fun movie(): MovieServices = provideRetrofit().create(MovieServices::class.java)
    fun tvshow(): TvShowServices = provideRetrofit().create(TvShowServices::class.java)
}
