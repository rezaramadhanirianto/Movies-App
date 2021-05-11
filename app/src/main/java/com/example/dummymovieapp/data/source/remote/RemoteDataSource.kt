package com.example.dummymovieapp.data.source.remote

import android.util.Log
import com.example.dummymovieapp.data.source.remote.network.Gate
import com.example.dummymovieapp.data.source.remote.response.MovieResponse
import com.example.dummymovieapp.data.source.remote.response.Response
import com.example.dummymovieapp.data.source.remote.response.TvShowResponse
import com.example.dummymovieapp.utils.EspressoIdlingResource
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit

class RemoteDataSource private constructor(private val gate: Gate){
    companion object{
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(gate: Gate): RemoteDataSource =
            instance ?: synchronized(this){
                instance ?: RemoteDataSource(gate)
            }

    }

    fun getAllMovies(callback: LoadMoviesCallback){
        EspressoIdlingResource.increment()

        val client = gate.movie().getMovies()
        client.enqueue(object: Callback<Response<List<MovieResponse>>>{
            override fun onResponse(
                call: Call<Response<List<MovieResponse>>>,
                response: retrofit2.Response<Response<List<MovieResponse>>>
            ) {
                if(response.isSuccessful){
                EspressoIdlingResource.decrement()
                  val result = response.body()
                    if (result != null) {
                        if(result.results.isNotEmpty()){
                            callback.onAllMoviesReceived(result.results)
                        }
                    }
                }
            }

            override fun onFailure(call: Call<Response<List<MovieResponse>>>, t: Throwable) {
                Log.d("REMOTE_DATA_SOURCE", "onFailure: $t")
            }
        })
    }

    fun getAllTvShows(callback: LoadTvShowsCallback){
        EspressoIdlingResource.increment()
        val client =  gate.tvshow().getTvShows()
        client.enqueue(object : Callback<Response<List<TvShowResponse>>>{
            override fun onResponse(
                call: Call<Response<List<TvShowResponse>>>,
                response: retrofit2.Response<Response<List<TvShowResponse>>>
            ) {
                if(response.isSuccessful){
                    EspressoIdlingResource.decrement()
                    val result = response.body()
                    if (result != null) {
                        if(result.results.isNotEmpty()){
                            callback.onAllTvShowsReceived(result.results)
                        }
                    }
                }
            }

            override fun onFailure(call: Call<Response<List<TvShowResponse>>>, t: Throwable) {
                Log.d("REMOTE_DATA_SOURCE", "onFailure: $t")
            }

        })
    }

    fun getMovie(id: String, callback: LoadMoviesCallback){
        EspressoIdlingResource.increment()
        val client = gate.movie().getMovie(id)
        client.enqueue(object : Callback<MovieResponse>{
            override fun onResponse(
                call: Call<MovieResponse>,
                response: retrofit2.Response<MovieResponse>
            ) {
                if(response.isSuccessful){
                    EspressoIdlingResource.decrement()
                    val result = response.body()
                    if (result != null) {
                        callback.onMovieReceived(result)
                    }
                }
            }

            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                Log.d("REMOTE_DATA_SOURCE", "onFailure: $t")
            }

        })
    }
    fun getTvShow(id: String, callback: LoadTvShowsCallback){
        EspressoIdlingResource.increment()
        val client = gate.tvshow().getTvShow(id)
        client.enqueue(object: Callback<TvShowResponse>{
            override fun onResponse(
                call: Call<TvShowResponse>,
                response: retrofit2.Response<TvShowResponse>
            ) {
                if(response.isSuccessful){
                    EspressoIdlingResource.decrement()
                    val result = response.body()
                    if (result != null) {
                        callback.onTvShowReceived(result)
                    }
                }
            }

            override fun onFailure(call: Call<TvShowResponse>, t: Throwable) {
                Log.d("REMOTE_DATA_SOURCE", "onFailure: $t")
            }

        })
    }

    interface LoadMoviesCallback {
        fun onAllMoviesReceived(movieResponse: List<MovieResponse>) {}
        fun onMovieReceived(response: MovieResponse) {}
    }
    interface  LoadTvShowsCallback {
        fun onAllTvShowsReceived(tvShowResponse: List<TvShowResponse>) {}
        fun onTvShowReceived(tvShowResponse: TvShowResponse) {}
    }
}
