package com.example.dummymovieapp.viewmodels

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.dummymovieapp.data.MovieEntity
import com.example.dummymovieapp.data.TvShowEntity
import com.example.dummymovieapp.data.source.repository.MovieRepository
import com.example.dummymovieapp.data.source.repository.TvShowRepository
import com.example.dummymovieapp.utils.DataDummy
import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class TvShowViewModelTest{
    lateinit var tvShowViewModel: TvShowViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var repo: TvShowRepository

    @Mock
    private lateinit var observer: Observer<List<TvShowEntity>>

    @Before
    fun init(){
        tvShowViewModel = TvShowViewModel(repo)
    }

    @Test
    fun getTvShow(){
        val dummyTvShows = DataDummy.getTvShows()
        val tvshows = MutableLiveData<List<TvShowEntity>>()
        tvshows.value = dummyTvShows

        Mockito.`when`(repo.getTvShows()).thenReturn(tvshows)
        val tvShowEntities = tvShowViewModel.getTvShow().value
        verify(repo).getTvShows()
        assertNotNull(tvShowEntities)
        assertEquals(10, tvShowEntities?.size)

        tvShowViewModel.getTvShow().observeForever(observer)
        verify(observer).onChanged(dummyTvShows)
    }
}