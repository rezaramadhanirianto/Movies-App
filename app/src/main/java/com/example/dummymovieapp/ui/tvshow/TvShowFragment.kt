package com.example.dummymovieapp.ui.tvshow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dummymovieapp.R
import com.example.dummymovieapp.adapters.TvShowAdapter
import com.example.dummymovieapp.databinding.FragmentTvShowBinding
import com.example.dummymovieapp.viewmodels.TvShowViewModel
import com.example.dummymovieapp.viewmodels.ViewModelFactory

class TvShowFragment : Fragment() {

    private lateinit var fragmentTvShowBinding: FragmentTvShowBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentTvShowBinding = FragmentTvShowBinding.inflate(layoutInflater, container, false)
        return fragmentTvShowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if(activity != null){
            val factory = ViewModelFactory()
            val viewModel = ViewModelProvider(this, factory)[TvShowViewModel::class.java]
            val adapterTvShow  = TvShowAdapter()
            fragmentTvShowBinding.progressBar.visibility = View.VISIBLE
            viewModel.getTvShow().observe(this, {
                tvShow ->
                fragmentTvShowBinding.progressBar.visibility = View.GONE
                adapterTvShow.setTvShow(tvShow)
                adapterTvShow.notifyDataSetChanged()

            })

            with(fragmentTvShowBinding.rvTvshow){
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = adapterTvShow
            }
        }
    }
}