package com.example.apiaybpos.data.network

import com.example.apiaybpos.core.RetrofitHelper
import com.example.apiaybpos.data.model.userModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class userService {
    private val retrofit= RetrofitHelper.getRetrofit()
    suspend fun getUsers():List<userModel>{
        return withContext(Dispatchers.IO){
            val response= retrofit.create(userApiClient::class.java).getAllUsers()
            response.body()?: emptyList()
        }
    }
}