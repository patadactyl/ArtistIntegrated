package com.artistintegrated.artisin.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {


    private val _text = MutableLiveData<String>().apply {
        value = ""
    }
    val text: LiveData<String> = _text

    var url = String()

    fun Photo (url: String) {
        this.url = url
    }

    fun getPhoto (): String {
        return url
    }
}