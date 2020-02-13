package com.artistintegrated.artisin.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Home Page \n" +
                "\n" +
                "A location-based timeline feed for posts about events and collaborations in a user's area."
    }
    val text: LiveData<String> = _text
}