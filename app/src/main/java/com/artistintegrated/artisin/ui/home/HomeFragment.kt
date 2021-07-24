package com.artistintegrated.artisin.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.artistintegrated.artisin.ContentObject
import com.artistintegrated.artisin.R
import com.artistintegrated.artisin.R.id.rv_content_list
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    private lateinit var adapter: HomeViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View?
    {

        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val recyclerView : RecyclerView = root.findViewById(R.id.rv_content_list)

        val contentFeed : ArrayList<String> = ArrayList()

        /* homeViewModel.text.observe(this, Observer {
            recyclerView.text = it
        }) */

        //addContent()
        //rv_content_list.layoutManager = LinearLayoutManager(activity)
        //rv_content_list.adapter = HomeViewAdapter(contentFeed, activity!!.applicationContext)

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        /* val contentFeed = listOf(
            ContentObject("Concert at the Gorge", "Gorge", "June 12-13"),
            ContentObject("Live Show at Taproot", "Taproot", "May 20"),
            ContentObject("Art Fair at Riverfront Park", "Riverfront Park", "April 20"),
            ContentObject("Travis Scoot", "My Haus", "April 20 Too")
        ) */

    }

}