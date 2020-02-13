package com.artistintegrated.artisin.ui.network

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NetworkViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Events Page \n" +
                "\n" +
                "Location based feed for other artists and creators in a user's area."
    }
    val text: LiveData<String> = _text
}