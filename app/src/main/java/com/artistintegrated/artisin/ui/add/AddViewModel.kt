package com.artistintegrated.artisin.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Add Content Page \n" +
                "\n" +
                "Add content to the location-based timeline."
    }
    val text: LiveData<String> = _text
}