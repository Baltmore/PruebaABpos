package com.example.apiaybpos.domain

import com.example.apiaybpos.data.UserRepository
import com.example.apiaybpos.data.model.userModel

class GetUsersUseCase {
    private val repository= UserRepository()
    suspend operator fun invoke():List<userModel>?= repository.getAllUsers()
}