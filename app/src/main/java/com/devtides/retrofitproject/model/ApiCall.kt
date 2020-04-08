package com.devtides.retrofitproject.model

import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.*

interface ApiCall {

    @GET("apiCall")
    fun callGet(): Call<ApiCallResponse>

}