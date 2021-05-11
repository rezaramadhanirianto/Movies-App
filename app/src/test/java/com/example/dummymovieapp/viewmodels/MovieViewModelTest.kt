package com.example.dummymovieapp.viewmodels

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.dummymovieapp.data.MovieEntity
import com.example.dummymovieapp.data.source.repository.MovieRepository
import com.example.dummymovieapp.di.Injection
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
class MovieViewModelTest{

    private lateinit var movieViewModel: MovieViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var repo: MovieRepository

    @Mock
    private lateinit var observer: Observer<List<MovieEntity>>

    @Before
    fun init() {
        movieViewModel = MovieViewModel(repo)

    }

    @Test
    fun getMovie(){
        val dummyMovies = DataDummy.getMovies()
        val movies = MutableLiveData<List<MovieEntity>>()
        movies.value = dummyMovies

        `when`(repo.getMovies()).thenReturn(movies)
        val movieEntities = movieViewModel.getMovie().value
        verify(repo).getMovies()
        assertNotNull(movieEntities)
        assertEquals(10, movieEntities?.size)

        movieViewModel.getMovie().observeForever(observer)
        verify(observer).onChanged(dummyMovies)
    }
}