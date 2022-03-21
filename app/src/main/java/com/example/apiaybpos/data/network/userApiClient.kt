package com.example.apiaybpos.data.network

import com.example.apiaybpos.data.model.userModel
import retrofit2.Response
import retrofit2.http.GET

interface userApiClient {
    @GET("/api/test/getOrders")
    suspend fun getAllUsers():Response<List<userModel>>
}