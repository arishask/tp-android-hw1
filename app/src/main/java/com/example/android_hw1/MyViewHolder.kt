package com.example.android_hw1

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(parent: ViewGroup) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.item_view,
            parent, false
        )
    ) {

    private val text = itemView.findViewById<TextView>(R.id.text_1)
    private val image_view = itemView.findViewById<ImageView>(R.id.image_view)

    fun bind(number: Int) {
        text.text = "$number"
        if (number % 2 == 1) {
            image_view.setBackgroundResource(R.color.blue)
        } else {
            image_view.setBackgroundResource(R.color.red)
        }
    }
}