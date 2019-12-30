package com.example.artistspace.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Marketplace \n" +
                "\n" +
                "Artists' work will be displayed here to be able to be purchased."
    }
    val text: LiveData<String> = _text
}