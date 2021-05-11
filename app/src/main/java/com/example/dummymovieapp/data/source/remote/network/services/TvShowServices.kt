package com.example.dummymovieapp.data.source.remote.network.services

import com.example.dummymovieapp.data.source.remote.response.MovieResponse
import com.example.dummymovieapp.data.source.remote.response.Response
import com.example.dummymovieapp.data.source.remote.response.TvShowResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface TvShowServices {

    @GET("tv/popular")
    fun getTvShows() : Call<Response<List<TvShowResponse>>>

    @GET("tv/{id}")
    fun getTvShow(
        @Path("id") id: String
    ): Call<TvShowResponse>
}