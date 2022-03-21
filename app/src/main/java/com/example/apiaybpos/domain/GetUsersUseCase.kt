package com.example.apiaybpos.domain

import com.example.apiaybpos.data.UserRepository
import com.example.apiaybpos.data.model.userModel

class GetUsersUseCase {
    //caso de uso para mostrar los datos solicitado desde la lista guardada
    private val repository= UserRepository()
    suspend operator fun invoke():List<userModel>?= repository.getAllUsers()
}