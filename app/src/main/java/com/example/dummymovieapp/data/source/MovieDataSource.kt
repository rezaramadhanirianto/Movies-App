package com.example.dummymovieapp.data.source

import androidx.lifecycle.LiveData
import com.example.dummymovieapp.data.MovieEntity

interface MovieDataSource {

    fun getMovies(): LiveData<List<MovieEntity>>
    fun getMovie(id: String): LiveData<MovieEntity>
}