package com.artistintegrated.artisin.ui.events

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EventsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Events Page \n" +
                "\n" +
                "Location based timeline for events in a user's area."
    }
    val text: LiveData<String> = _text
}