package com.example.dummymovieapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.dummymovieapp.data.MovieEntity
import com.example.dummymovieapp.data.source.repository.MovieRepository
import com.example.dummymovieapp.di.Injection
import com.example.dummymovieapp.utils.DataDummy


class MovieViewModel(private val repo: MovieRepository): ViewModel() {
    fun getMovie() : LiveData<List<MovieEntity>> {
        return repo.getMovies()
    }
}