package com.example.dummymovieapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.dummymovieapp.R
import com.example.dummymovieapp.data.source.remote.RemoteDataSource
import com.example.dummymovieapp.data.source.remote.network.Gate
import com.example.dummymovieapp.data.source.remote.response.MovieResponse
import com.example.dummymovieapp.databinding.ActivitySplashScreenBinding
import com.example.dummymovieapp.ui.home.MainActivity
import java.util.*

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val splashScreenBinding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(splashScreenBinding.root)

        val remote = RemoteDataSource.getInstance(Gate())
        remote.getAllMovies(object : RemoteDataSource.LoadMoviesCallback{
            override fun onAllMoviesReceived(courseResponses: List<MovieResponse>) {

            }

        })

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }, 4000)

    }
}