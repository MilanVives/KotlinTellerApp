package com.example.tellerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.example.tellerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.tvCounter.text = viewModel.number.toString()

        binding.btnIncrement.setOnClickListener{
            viewModel.incrementNumber()
            binding.tvCounter.text = viewModel.number.toString()
        }
    }
}