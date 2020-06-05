package com.example.level6_task2.Api

import com.example.level6_task2.Model.ApiResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

const val KEY = "1273cd07d5c7e88084bf7387cdc1eaf9"

interface MoviesApiService {

    @GET("discover/movie?api_key=$KEY&language=en-US&sort_by=popularity.desc&include_adult=false&include_video=false&page=1&")
    fun getMoviesByYear(@Query("primary_release_year") year: String): Call<ApiResponse>

}