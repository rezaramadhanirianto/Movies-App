package com.example.dummymovieapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.dummymovieapp.R
import com.example.dummymovieapp.data.MovieEntity
import com.example.dummymovieapp.data.TvShowEntity
import com.example.dummymovieapp.databinding.ActivityDetailBinding
import com.example.dummymovieapp.databinding.ActivityMainBinding
import com.example.dummymovieapp.viewmodels.DetailViewModel
import com.example.dummymovieapp.viewmodels.ViewModelFactory

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_MOVIE = "extra_movie"
        const val EXTRA_TVSHOW = "extra_tvshow"
    }

    private lateinit var detailBinding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)

        detailBinding.imgBack.setOnClickListener{
            view -> onBackPressed()
        }

        val factory = ViewModelFactory()
        val viewModel = ViewModelProvider(this, factory)[DetailViewModel::class.java]

        val extras = intent.extras
        if(extras != null){
            val movieId = extras.getString(EXTRA_MOVIE)
            val tvshowId = extras.getString(EXTRA_TVSHOW)
            detailBinding.progressBar.visibility = View.VISIBLE
            detailBinding.lytContent.visibility = View.GONE
            if(movieId != null){
                viewModel.setSelectedMovie(movieId)
                viewModel.getMovie().observe(this, { movie ->
                    detailBinding.progressBar.visibility = View.GONE
                    detailBinding.lytContent.visibility = View.VISIBLE
                    populateMovie(movie)
                })
            }else{
                viewModel.setSelectedTvShow(tvshowId!!)
                viewModel.getTvShow().observe(this, { tvshow ->
                    detailBinding.progressBar.visibility = View.GONE
                    detailBinding.lytContent.visibility = View.VISIBLE
                    populateTvShow(tvshow)
                })
            }
        }
    }

    private fun populateTvShow(tvshow: TvShowEntity){
        detailBinding.tvTitle.text = tvshow.name
        detailBinding.tvDescription.text = tvshow.description
        detailBinding.tvReleased.text = tvshow.released
        detailBinding.rating.rating = tvshow.rate.toFloat()

        Glide.with(this)
            .load(tvshow.imageUrl)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                    .error(R.drawable.ic_error))
            .into(detailBinding.imgDetail)
    }

    private fun populateMovie(movie: MovieEntity) {
        detailBinding.tvTitle.text = movie.name
        detailBinding.tvDescription.text = movie.description
        detailBinding.tvReleased.text = movie.released
        detailBinding.rating.rating = movie.rate.toFloat()

        Glide.with(this)
            .load(movie.imageUrl)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                .error(R.drawable.ic_error))
            .into(detailBinding.imgDetail)
    }
}