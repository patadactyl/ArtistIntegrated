package com.artistintegrated.artisin.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.artistintegrated.artisin.R
import kotlinx.android.synthetic.main.home_content_frame.view.*
import java.util.*

class HomeViewAdapter(val items: ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
                return ViewHolder(
                        LayoutInflater.from(context).inflate(
                                R.layout.fragment_home,
                                parent,
                                false
                        )
                )
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                //holder?.contentPost?.text = items.get(position)
        }

        override fun getItemCount(): Int {
                return items.size
        }
}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val contentPost = itemView.tv_content_posted
}

