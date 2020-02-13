package com.artistintegrated.artisin.ui.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Profile \n" +
                "\n" +
                "Here a user can edit and view their profile. Will include posts by the user, as well as past and future events attended."
    }
    val text: LiveData<String> = _text
}