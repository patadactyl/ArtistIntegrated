package com.artistintegrated.artisin

import android.media.Image
import java.util.*

class ContentObject(val title: String,
                    val location: String,
                    val date: String
                    //val image: home_event_image
                    ) {
    var url = String()

    fun Photo (url: String) {
        this.url = url
    }

    fun getPhoto (): String {
        return url
    }
}