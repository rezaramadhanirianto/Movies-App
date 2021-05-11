package com.example.dummymovieapp.di

import com.example.dummymovieapp.data.source.repository.MovieRepository
import com.example.dummymovieapp.data.source.remote.RemoteDataSource
import com.example.dummymovieapp.data.source.remote.network.Gate
import com.example.dummymovieapp.data.source.repository.TvShowRepository

object Injection {
    fun provideMovieRepository(): MovieRepository {
        val gate = Gate()
        val remoteDataSource = RemoteDataSource.getInstance(gate)
        val movieRepository = MovieRepository.getInstance(remoteDataSource)
        return movieRepository
    }
    fun provideTvShowRepository(): TvShowRepository{
        val gate = Gate()
        val remoteDataSource = RemoteDataSource.getInstance(gate)
        val tvShowRepository = TvShowRepository.getInstance(remoteDataSource)
        return tvShowRepository
    }
}