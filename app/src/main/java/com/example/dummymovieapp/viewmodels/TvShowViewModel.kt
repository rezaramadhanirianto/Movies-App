package com.example.dummymovieapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.dummymovieapp.data.TvShowEntity
import com.example.dummymovieapp.data.source.repository.TvShowRepository
import com.example.dummymovieapp.di.Injection
import com.example.dummymovieapp.utils.DataDummy

class TvShowViewModel(private val tvShowRepository: TvShowRepository): ViewModel() {
    fun getTvShow(): LiveData<List<TvShowEntity>>{
        return tvShowRepository.getTvShows()
    }
}