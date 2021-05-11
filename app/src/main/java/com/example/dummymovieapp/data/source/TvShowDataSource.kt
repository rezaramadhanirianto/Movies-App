package com.example.dummymovieapp.data.source

import androidx.lifecycle.LiveData
import com.example.dummymovieapp.data.TvShowEntity

interface TvShowDataSource {
    fun getTvShows(): LiveData<List<TvShowEntity>>
    fun getTvShow(id: String): LiveData<TvShowEntity>
}