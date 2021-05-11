package com.example.dummymovieapp.data.source.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.dummymovieapp.data.MovieEntity
import com.example.dummymovieapp.data.source.MovieDataSource
import com.example.dummymovieapp.data.source.remote.RemoteDataSource
import com.example.dummymovieapp.data.source.remote.response.MovieResponse

class MovieRepository private constructor(private val remoteDataSource: RemoteDataSource): MovieDataSource{
    companion object{
        @Volatile
        private var instance: MovieRepository? = null

        fun getInstance(
            remoteData: RemoteDataSource,
        ): MovieRepository = instance ?: synchronized(this){
            instance ?: MovieRepository(remoteData)
        }
    }

    override fun getMovies(): LiveData<List<MovieEntity>> {
        var movies = MutableLiveData<List<MovieEntity>>()
        remoteDataSource.getAllMovies(object : RemoteDataSource.LoadMoviesCallback{
            override fun onAllMoviesReceived(movieResponse: List<MovieResponse>) {
                val movieList = ArrayList<MovieEntity>()
                for(response in movieResponse){
                    val movieEntity = MovieEntity(
                        response.id,
                        response.title,
                        response.released,
                        "https://image.tmdb.org/t/p/w500${response.imageUrl}",
                        response.description,
                        response.rating
                    )
                    movieList.add(movieEntity)
                }
                movies.postValue(movieList)
            }
        })
        return movies
    }

    override fun getMovie(id: String): LiveData<MovieEntity> {
        val movie = MutableLiveData<MovieEntity>()
        remoteDataSource.getMovie(id, object : RemoteDataSource.LoadMoviesCallback{
            override fun onMovieReceived(response: MovieResponse) {
                val movieEntity = MovieEntity(
                    response.id,
                    response.title,
                    response.released,
                    "https://image.tmdb.org/t/p/w500${response.imageUrl}",
                    response.description,
                    response.rating
                )
                movie.postValue(movieEntity)
            }
        })
        return movie
    }


}