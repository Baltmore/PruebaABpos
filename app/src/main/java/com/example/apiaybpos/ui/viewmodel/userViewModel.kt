package com.example.apiaybpos.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.apiaybpos.data.model.userModel
import com.example.apiaybpos.domain.GetUsersUseCase
import kotlinx.coroutines.launch

class userViewModel : ViewModel(){
//variable para actualizar cualquier cambio realizado desde el backend
    val userModel= MutableLiveData<userModel>()

    var getUsersUseCase= GetUsersUseCase()
//funcion para llamar a el caso de uso y encontrar la informacion requerida
    fun onCreate(){
            viewModelScope.launch {
                val result = getUsersUseCase()
                if (!result.isNullOrEmpty()) {
                    userModel.postValue(result[0])
                }
        }

    }
}