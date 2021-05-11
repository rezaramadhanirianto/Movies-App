package com.example.dummymovieapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.dummymovieapp.data.MovieEntity
import com.example.dummymovieapp.data.TvShowEntity
import com.example.dummymovieapp.data.source.repository.MovieRepository
import com.example.dummymovieapp.data.source.repository.TvShowRepository
import com.example.dummymovieapp.di.Injection
import com.example.dummymovieapp.utils.DataDummy

class DetailViewModel(private val movieRepository: MovieRepository, private val tvShowRepository: TvShowRepository): ViewModel() {
    private lateinit var movieId: String
    private lateinit var tvShowId: String
    fun setSelectedMovie(id: String){
        this.movieId = id
    }
    fun setSelectedTvShow(id: String){
        this.tvShowId = id
    }
    fun getMovie(): LiveData<MovieEntity>{
        val movie = movieRepository.getMovie(movieId)
        return movie
    }
    fun getTvShow(): LiveData<TvShowEntity>{
        val tvShow = tvShowRepository.getTvShow(tvShowId)
        return tvShow
    }
}
