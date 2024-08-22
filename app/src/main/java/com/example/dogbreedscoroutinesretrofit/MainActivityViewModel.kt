package com.example.dogbreedscoroutinesretrofit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainActivityViewModel:ViewModel() {
    private val repo = MainActivityRepo()
    val poodle = MutableLiveData<List<String>>()

    fun getPoodle() {
        viewModelScope.launch {
            poodle.value = repo.getPoodle()
        }
    }


}