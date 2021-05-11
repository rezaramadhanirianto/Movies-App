package com.example.dummymovieapp.data.source.remote.network.services

import com.example.dummymovieapp.data.source.remote.response.MovieResponse
import com.example.dummymovieapp.data.source.remote.response.Response
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface MovieServices {
    @GET("discover/movie")
    fun getMovies(): Call<Response<List<MovieResponse>>>

    @GET("movie/{id}")
    fun getMovie(
        @Path("id") id: String
    ): Call<MovieResponse>
}