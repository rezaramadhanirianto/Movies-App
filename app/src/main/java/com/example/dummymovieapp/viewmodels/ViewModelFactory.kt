package com.example.dummymovieapp.viewmodels

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dummymovieapp.data.source.repository.MovieRepository
import com.example.dummymovieapp.di.Injection

class ViewModelFactory: ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MovieViewModel::class.java) -> {
                val repo = Injection.provideMovieRepository()
                MovieViewModel(repo) as T
            }
            modelClass.isAssignableFrom(TvShowViewModel::class.java) ->{
                val repo = Injection.provideTvShowRepository()
                TvShowViewModel(repo) as T
            }
            modelClass.isAssignableFrom(DetailViewModel::class.java) ->{
                val movieRepo = Injection.provideMovieRepository()
                val tvShowRepo = Injection.provideTvShowRepository()
                DetailViewModel(movieRepo, tvShowRepo) as T
            }
            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }
    }
}