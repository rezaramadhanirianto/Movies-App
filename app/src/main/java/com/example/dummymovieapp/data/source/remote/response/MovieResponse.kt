package com.example.dummymovieapp.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @field:SerializedName("id")
    val id: String,

    @field:SerializedName("original_title")
    val title: String,

    @field:SerializedName("overview")
    val description: String,

    @field:SerializedName("release_date")
    val released: String,

    @field:SerializedName("vote_average")
    val rating: Double,

    @field:SerializedName("poster_path")
    val imageUrl: String,
)

