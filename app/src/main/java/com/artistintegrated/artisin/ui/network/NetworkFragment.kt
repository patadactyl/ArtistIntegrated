package com.artistintegrated.artisin.ui.network

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.artistintegrated.artisin.R

class NetworkFragment : Fragment() {

    private lateinit var networkViewModel: NetworkViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        networkViewModel =
            ViewModelProviders.of(this).get(NetworkViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_network, container, false)
        val textView: TextView = root.findViewById(R.id.text_network)
        networkViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}