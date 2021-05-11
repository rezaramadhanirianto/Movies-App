package com.example.dummymovieapp.data.source.repository

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.dummymovieapp.data.FakeTvShowRepository
import com.example.dummymovieapp.data.source.remote.RemoteDataSource
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

class TvShowRepositoryTest{
    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = mock(RemoteDataSource::class.java)
    private val repository = FakeTvShowRepository(remote)

    private val tvShowResponse = DataDummy.getTvShowsResponse()
    private val tvShow = tvShowResponse[0]

    @Test
    fun getAllMovies(){
        doAnswer {
                invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadTvShowsCallback)
                .onAllTvShowsReceived(tvShowResponse)
            null
        }.`when`(remote).getAllTvShows(any())
        val tvShowEntity = LiveDataTestUtils.getValue(repository.getTvShows())
        verify(remote).getAllTvShows(any())
        assertNotNull(tvShowEntity)
        assertEquals(tvShowResponse.size.toLong(), tvShowEntity.size.toLong())
    }

    @Test
    fun getMovie(){
        doAnswer {
                invocation ->
            (invocation.arguments[1] as RemoteDataSource.LoadTvShowsCallback)
                .onTvShowReceived(tvShow)
            null
        }.`when`(remote).getTvShow(eq(tvShow.id), any())
        val tvShowEntity = LiveDataTestUtils.getValue(repository.getTvShow(tvShow.id))
        verify(remote).getTvShow(eq(tvShow.id), any())
        assertNotNull(tvShowEntity)
        assertNotNull(tvShowEntity.name)
        assertEquals(tvShowEntity.name, tvShow.title)
    }
}