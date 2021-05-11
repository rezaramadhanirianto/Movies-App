package com.example.dummymovieapp.adapters

import android.content.Intent
import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.dummymovieapp.R
import com.example.dummymovieapp.data.MovieEntity
import com.example.dummymovieapp.data.TvShowEntity
import com.example.dummymovieapp.databinding.ItemMovieBinding
import com.example.dummymovieapp.databinding.ItemTvShowBinding
import com.example.dummymovieapp.ui.detail.DetailActivity

class TvShowAdapter: RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>(){
    private var listTvshow = ArrayList<TvShowEntity>()

    fun setTvShow(tvshow: List<TvShowEntity>?) {
        if (tvshow == null) return
        this.listTvshow.clear()
        this.listTvshow.addAll(tvshow)

    }

    class TvShowViewHolder(private val binding: ItemTvShowBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(tvshow: TvShowEntity){
            with(binding){
                binding.tvTvshow.text = tvshow.name
                binding.tvDescription.text = tvshow.description
                binding.tvRating.text = tvshow.rate.toString()
                binding.tvReleased.text = tvshow.released
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_TVSHOW, tvshow.id)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(tvshow.imageUrl)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                    )
                    .into(binding.imgTvshow)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TvShowAdapter.TvShowViewHolder {
        val itemtvShowBinding = ItemTvShowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(itemtvShowBinding)
    }

    override fun onBindViewHolder(holder: TvShowAdapter.TvShowViewHolder, position: Int) {
        val tvshow = listTvshow.get(position)
        holder.bind(tvshow)
    }

    override fun getItemCount(): Int {
        return listTvshow.size
    }

}

