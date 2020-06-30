package com.puneet.imageviewer.data.api

import models.Result
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface RetrofitApiInterface {
    @GET("search/")
    fun getSearchResults(@QueryMap searchParams: Map<String, String>): Call<Result>
}