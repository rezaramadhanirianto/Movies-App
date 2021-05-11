package com.example.dummymovieapp.data

data class MovieEntity(
    val id: String,
    val name: String,
    val released: String,
    val imageUrl: String,
    val description: String,
    val rate: Double
)