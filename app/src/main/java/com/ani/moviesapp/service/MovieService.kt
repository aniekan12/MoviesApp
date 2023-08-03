package com.ani.moviesapp.service

import com.ani.moviesapp.model.Movies
import retrofit2.Response
import retrofit2.http.GET

interface MovieService {
    @GET("/movie/popular")
    suspend fun getMovies() : Response<ArrayList<Movies>>
}