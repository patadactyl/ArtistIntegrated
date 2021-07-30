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
import com.google.android.material.bottomnavigation.BottomNavigationView

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
        networkViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        showBottomNav()
        return root
    }

    private fun showBottomNav() {
        val navView: BottomNavigationView = activity!!.findViewById(R.id.nav_view)
        navView.visibility = View.VISIBLE
    }
}