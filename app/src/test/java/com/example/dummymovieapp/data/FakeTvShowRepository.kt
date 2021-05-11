package com.example.dummymovieapp.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.dummymovieapp.data.source.TvShowDataSource
import com.example.dummymovieapp.data.source.remote.RemoteDataSource
import com.example.dummymovieapp.data.source.remote.response.TvShowResponse

class FakeTvShowRepository(private val remoteDataSource: RemoteDataSource): TvShowDataSource {
    override fun getTvShows(): LiveData<List<TvShowEntity>> {
        val tvshows = MutableLiveData<List<TvShowEntity>>()
        remoteDataSource.getAllTvShows(object : RemoteDataSource.LoadTvShowsCallback{
            override fun onAllTvShowsReceived(tvShowResponse: List<TvShowResponse>) {
                val tvShowList = ArrayList<TvShowEntity>()
                for(tvShow in tvShowResponse){
                    val tvShowEntity = TvShowEntity(
                        tvShow.id,
                        tvShow.title,
                        "",
                        "https://image.tmdb.org/t/p/w500${tvShow.imageUrl}",
                        tvShow.description,
                        tvShow.rating
                    )
                    tvShowList.add(tvShowEntity)
                }
                tvshows.postValue(tvShowList)
            }
        })
        return tvshows
    }

    override fun getTvShow(id: String): LiveData<TvShowEntity> {
        val tvShow = MutableLiveData<TvShowEntity>()
        remoteDataSource.getTvShow(id, object: RemoteDataSource.LoadTvShowsCallback{
            override fun onTvShowReceived(tvShowResponse: TvShowResponse) {
                val tvShowEntity = TvShowEntity(
                    tvShowResponse.id,
                    tvShowResponse.title,
                    "",
                    "https://image.tmdb.org/t/p/w500${tvShowResponse.imageUrl}",
                    tvShowResponse.description,
                    tvShowResponse.rating
                )
                tvShow.postValue(tvShowEntity)
            }
        })
        return tvShow
    }

}