package com.example.dummymovieapp.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.dummymovieapp.R
import com.example.dummymovieapp.data.MovieEntity
import com.example.dummymovieapp.databinding.ItemMovieBinding
import com.example.dummymovieapp.ui.detail.DetailActivity

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    private var listMovie = ArrayList<MovieEntity>()
    fun setMovie(movie: List<MovieEntity>?) {
        if (movie == null) return
        this.listMovie.clear()
        this.listMovie.addAll(movie)

    }
    class MovieViewHolder(private val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind (movie: MovieEntity) {
            with(binding) {
                tvMovie.text = movie.name
                tvDescription.text = movie.description
                tvRating.text = movie.rate.toString()
                tvReleased.text = movie.released
                rating.rating = movie.rate.toFloat()

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_MOVIE, movie.id)
                    itemView.context.startActivity(intent)
                }

                Glide.with(itemView.context)
                    .load(movie.imageUrl)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                    )
                    .into(imgMovie)
            }
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieAdapter.MovieViewHolder {
        val itemMovieBinding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemMovieBinding)
    }

    override fun onBindViewHolder(holder: MovieAdapter.MovieViewHolder, position: Int) {
        val movie = listMovie.get(position)
        holder.bind(movie)
    }

    override fun getItemCount(): Int {
        return listMovie.size
    }
}