package com.example.tellerapp

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    var number = 0
    fun incrementNumber(){
        number++
    }
}