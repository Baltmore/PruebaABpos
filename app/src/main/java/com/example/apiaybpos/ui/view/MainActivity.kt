package com.example.apiaybpos.ui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.example.apiaybpos.databinding.ActivityMainBinding
import com.example.apiaybpos.ui.viewmodel.userViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private val userViewModel: userViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        userViewModel.onCreate()
        binding.button0.setOnClickListener {numeroPresionado("0")}
        binding.button1.setOnClickListener {numeroPresionado("1")}
        binding.button2.setOnClickListener {numeroPresionado("2")}
        binding.button3.setOnClickListener {numeroPresionado("3")}
        binding.button4.setOnClickListener {numeroPresionado("4")}
        binding.button5.setOnClickListener {numeroPresionado("5")}
        binding.button6.setOnClickListener {numeroPresionado("6")}
        binding.button7.setOnClickListener {numeroPresionado("7")}
        binding.button8.setOnClickListener {numeroPresionado("8")}
        binding.button9.setOnClickListener {numeroPresionado("9")}
        binding.buttonClear.setOnClickListener { binding.textviewclave.setText("") }
        binding.buttonGo.setOnClickListener {
            if (binding.textviewclave.text.equals("123")) {
                val intent = Intent(this, MainActivity2::class.java).apply {
                }
                startActivity(intent)


            } else {
                Toast.makeText(this, "Codigo Incorrecto", Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun numeroPresionado(digito:String){
        binding.textviewclave.text= "${binding.textviewclave.text}$digito"
    }
}