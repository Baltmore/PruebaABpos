package com.example.apiaybpos.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://dev-graphql.azurewebsites.net/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}