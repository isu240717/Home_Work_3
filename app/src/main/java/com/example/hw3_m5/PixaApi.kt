package com.example.hw3_m5

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

//https://pixabay.com/api/
interface PixaApi {
    @GET("api/")
    fun getImages(
        @Query("key") key: String = "40850358-12f83565295d680581e56064f",
        @Query("q") keyWord: String,
        @Query("per_page")perPage:Int = 3,
        @Query("page")page:Int=1
    ): Call<PixaModel>
}