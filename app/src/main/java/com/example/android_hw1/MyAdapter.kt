package com.example.android_hw1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(): RecyclerView.Adapter<MyViewHolder>() {

    private val items = ArrayList<Int>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(items[position])
    }

    fun setItems(newList: List<Int>) {
        val diffCallback = MainDiffUtilCallback(items, newList)
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        items.clear()
        items.addAll(newList)
        diffResult.dispatchUpdatesTo(this)
    }

    fun addItems(item: Int){
        items.add(item)
        notifyDataSetChanged()
    }

    fun getItems(): ArrayList<Int>{
        return items
    }

}