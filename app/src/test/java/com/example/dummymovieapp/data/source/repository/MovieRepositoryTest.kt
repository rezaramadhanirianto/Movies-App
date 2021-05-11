package com.example.dummymovieapp.data.source.repository

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.LiveData
import com.example.dummymovieapp.data.FakeMovieRepository
import com.example.dummymovieapp.data.MovieEntity
import com.example.dummymovieapp.data.source.remote.RemoteDataSource
import com.example.dummymovieapp.data.source.remote.response.MovieResponse
import com.example.dummymovieapp.utils.DataDummy
import com.example.dummymovieapp.utils.LiveDataTestUtils
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.doAnswer
import com.nhaarman.mockitokotlin2.eq
import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito.mock

class MovieRepositoryTest{
    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()
    
    private val remote = mock(RemoteDataSource::class.java)
    private val repository =  FakeMovieRepository(remote)

    private val movieResponse = DataDummy.getMoviesResponse()
    private val movie = movieResponse[0]


    @Test
    fun getAllMovies(){
        doAnswer {
            invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadMoviesCallback)
                .onAllMoviesReceived(movieResponse)
            null
        }.`when`(remote).getAllMovies(any())
        val movieEntity = LiveDataTestUtils.getValue(repository.getMovies())
        verify(remote).getAllMovies(any())
        assertNotNull(movieEntity)
        assertEquals(movieResponse.size.toLong(), movieEntity.size.toLong())
    }

    @Test
    fun getMovie(){
        doAnswer {
                invocation ->
            (invocation.arguments[1] as RemoteDataSource.LoadMoviesCallback)
                .onMovieReceived(movie)
            null
        }.`when`(remote).getMovie(eq(movie.id), any())
        val movieEntity = LiveDataTestUtils.getValue(repository.getMovie(movie.id))
        verify(remote).getMovie(eq(movie.id), any())
        assertNotNull(movieEntity)
        assertNotNull(movieEntity.name)
        assertEquals(movieEntity.name, movie.title)
    }
}