package com.example.dummymovieapp.viewmodels

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
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
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DetailViewModelTest{
    private lateinit var detailViewModel: DetailViewModel
    private var dummyMovies = DataDummy.getMovies()
    private var dummyMovie = dummyMovies[0]
    private var dummyTvShows = DataDummy.getTvShows()
    private var dummyTvShow = dummyTvShows[0]

    @Mock
    private lateinit var movieRepo: MovieRepository

    @Mock
    private lateinit var tvShowRepo: TvShowRepository

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Before
    fun init(){
        detailViewModel = DetailViewModel(movieRepo, tvShowRepo)
    }

    @Test
    fun detailMovie(){
        val movie = MutableLiveData<MovieEntity>()
        movie.value = dummyMovie

        `when`(movieRepo.getMovie(dummyMovie.id)).thenReturn(movie)
        detailViewModel.setSelectedMovie(dummyMovie.id)
        val movieEntity = detailViewModel.getMovie().value as MovieEntity
        verify(movieRepo).getMovie(dummyMovie.id)
        assertNotNull(movieEntity)
        assertEquals(movieEntity.name, dummyMovie.name)
    }

    @Test
    fun detailTvShow(){
        val tvshow = MutableLiveData<TvShowEntity>()
        tvshow.value = dummyTvShow

        `when`(tvShowRepo.getTvShow(dummyTvShow.id)).thenReturn(tvshow)
        detailViewModel.setSelectedTvShow(dummyTvShow.id)
        val tvShowEntity = detailViewModel.getTvShow().value as TvShowEntity
        verify(tvShowRepo).getTvShow(dummyTvShow.id)
        assertNotNull(tvShowEntity)
        assertEquals(tvShowEntity.name, dummyTvShow.name)
    }
}