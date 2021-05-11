package com.example.dummymovieapp.utils

import com.example.dummymovieapp.data.MovieEntity
import com.example.dummymovieapp.data.source.remote.response.MovieResponse

object DataMapper {
    fun mapResponseToEntities(input: List<MovieResponse>): List<MovieEntity>{
        val movies = ArrayList<MovieEntity>()
        input.map {
            val movie = MovieEntity(
                id = it.id,
                name = it.title,
                released = it.released,
                imageUrl = "https://image.tmdb.org/t/p/w500${it.imageUrl}",
                rate = it.rating,
                description = it.description
            )
            movies.add(movie)
        }
        return movies
    }
}
