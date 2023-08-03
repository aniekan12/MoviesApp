package com.ani.moviesapp.retrofit_instance

import retrofit2.Retrofit

class RetrofitInstance {


    companion object {
        private const val BASEURL = "https://api.themoviedb.org/3/"
        fun getRetrofitInstance(): Retrofit {

            return Retrofit
                .Builder()
                .baseUrl(BASEURL)
                .build()
        }
    }

}