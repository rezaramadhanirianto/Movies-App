package com.example.dummymovieapp.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class Response<T> (
    @field:SerializedName("status_message")
    val message: String,
    @field:SerializedName("status_code")
    val code: Int,
    @field:SerializedName("success")
    val status: Boolean,
    @field:SerializedName("page")
    val page: Int,
    @field:SerializedName("results")
    val results: T,
)