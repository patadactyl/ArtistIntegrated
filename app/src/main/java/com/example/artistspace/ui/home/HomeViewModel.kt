package com.example.artistspace.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Home Page \n" +
                "\n" +
                "A classic timeline feed for posts by people the user follows."
    }
    val text: LiveData<String> = _text
}