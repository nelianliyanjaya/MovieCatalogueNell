package com.nell.moviecataloguenell

import retrofit2.Call
import retrofit2.http.GET

interface TvApiInterface {

    @GET("/3/tv/popular?api_key=6c34cda0a72ce9d11ba149a47ebd489c")
    fun getTvList(): Call<TvResponse>
}