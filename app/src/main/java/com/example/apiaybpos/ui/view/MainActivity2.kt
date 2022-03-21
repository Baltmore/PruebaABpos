package com.example.apiaybpos.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.apiaybpos.data.model.userModel
import com.example.apiaybpos.databinding.ActivityMain2Binding
import com.example.apiaybpos.domain.GetUsersUseCase
import com.example.apiaybpos.ui.viewmodel.userViewModel

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    private val userViewModel: userViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        userViewModel.onCreate()
        userViewModel.userModel.observe(this, Observer { currentUSER ->
            binding.order1.text = "Order: ${currentUSER.orderId.toString()}"
            binding.user1.text = "User: ${currentUSER.username}"
            binding.total1.text = "Total: ${currentUSER.subTotal.toString()}"
            binding.tiket1.text = "Ticket: ${currentUSER.ticketNumber.toString()}"
            binding.time1.text = "OrderTime: ${currentUSER.orderDateTime}"
            binding.ordertipe1.text = "Dine In: ${currentUSER.orderType.toString()}"
            binding.order2.text = "Order: ${currentUSER.orderId.toString()}"
            binding.user2.text = "User: ${currentUSER.username}"
            binding.total2.text = "Total: ${currentUSER.subTotal.toString()}"
            binding.tiket2.text = "Ticket: ${currentUSER.ticketNumber.toString()}"
            binding.time2.text = "OrderTime: ${currentUSER.orderDateTime}"
            binding.ordertipe2.text = "Dine In: ${currentUSER.orderType.toString()}"
            binding.order3.text = "Order: ${currentUSER.orderId.toString()}"
            binding.user3.text = "User: ${currentUSER.username}"
            binding.total3.text = "Total: ${currentUSER.subTotal.toString()}"
            binding.tiket3.text = "Ticket: ${currentUSER.ticketNumber.toString()}"
            binding.time3.text = "OrderTime: ${currentUSER.orderDateTime}"
            binding.ordertipe3.text = "Dine In: ${currentUSER.orderType.toString()}"
            binding.order4.text = "Order: ${currentUSER.orderId.toString()}"
            binding.user4.text = "User: ${currentUSER.username}"
            binding.total4.text = "Total: ${currentUSER.subTotal.toString()}"
            binding.tiket4.text = "Ticket: ${currentUSER.ticketNumber.toString()}"
            binding.time4.text = "OrderTime: ${currentUSER.orderDateTime}"
            binding.ordertipe4.text = "Dine In: ${currentUSER.orderType.toString()}"
            binding.order5.text = "Order: ${currentUSER.orderId.toString()}"
            binding.user5.text = "User: ${currentUSER.username}"
            binding.total5.text = "Total: ${currentUSER.subTotal.toString()}"
            binding.tiket5.text = "Ticket: ${currentUSER.ticketNumber.toString()}"
            binding.time5.text = "OrderTime: ${currentUSER.orderDateTime}"
            binding.ordertipe5.text = "Dine In: ${currentUSER.orderType.toString()}"


        })
    }
}