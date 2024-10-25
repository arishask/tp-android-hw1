package com.example.android_hw1

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyViewHolder(view:View): RecyclerView.ViewHolder(view) {
    val text = view.findViewById<TextView>(R.id.text_1)
    val image_view = view.findViewById<ImageView>(R.id.image_view)


    fun bind(number: Int){
        text.text = "$number"
        if (number%2==1) {
            image_view.setBackgroundResource(R.color.blue)
        }
        else{
            image_view.setBackgroundResource(R.color.red)
        }
    }
}