package com.example.dummymovieapp.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dummymovieapp.R
import com.example.dummymovieapp.adapters.MovieAdapter
import com.example.dummymovieapp.databinding.FragmentMovieBinding
import com.example.dummymovieapp.viewmodels.MovieViewModel
import com.example.dummymovieapp.viewmodels.ViewModelFactory

class MovieFragment : Fragment() {

    private lateinit var fragmentMovieBinding: FragmentMovieBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentMovieBinding = FragmentMovieBinding.inflate(layoutInflater, container, false)
        return fragmentMovieBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(activity != null){

            val factory = ViewModelFactory()
            val viewModel = ViewModelProvider(this, factory)[MovieViewModel::class.java]
            val adapterMovie = MovieAdapter()
            fragmentMovieBinding.progressBar.visibility = View.VISIBLE
            viewModel.getMovie().observe(this, {
                movies ->
                fragmentMovieBinding.progressBar.visibility = View.GONE
                adapterMovie.setMovie(movies)
                adapterMovie.notifyDataSetChanged()
            })
            with(fragmentMovieBinding.rvMovie){
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = adapterMovie
            }
        }
    }
}

