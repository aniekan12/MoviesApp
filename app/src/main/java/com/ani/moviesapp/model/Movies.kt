package com.ani.moviesapp.model

import com.google.gson.annotations.SerializedName

data class Movies(
    @SerializedName("original_title")
    val originalTitle:String,
    @SerializedName("backdrop_path")
    val backdropPath:String,
    @SerializedName("vote_average")
    val voteAverage:Double,
    @SerializedName("vote_count")
    val voteCount:Long,
    @SerializedName("overview")
    val overview:String,
)