package com.example.apiaybpos.data

import com.example.apiaybpos.data.model.UserProvider
import com.example.apiaybpos.data.model.userModel
import com.example.apiaybpos.data.network.userService

class UserRepository {
    private val api = userService()
    //conexion entre el servicio en linea y el local, en este caso user provider (local) y use service (web)
    suspend fun getAllUsers():List<userModel>{
        var response= api.getUsers()
        UserProvider.users=response
        return response
    }
}