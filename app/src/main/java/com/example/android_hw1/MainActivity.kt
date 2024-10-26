package com.example.android_hw1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : ComponentActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var fab: FloatingActionButton
    var itemArray = ArrayList<Int>()

    private val adapter = MyAdapter()
    val ITEM_ARRAY_KEY = "itemArray"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view)
        fab = findViewById(R.id.fab)

        recyclerView.adapter = adapter
        fab.setOnClickListener{
            adapter.addItems(adapter.itemCount + 1)
        }
        if (savedInstanceState !=  null) {
            itemArray = savedInstanceState.getIntegerArrayList(ITEM_ARRAY_KEY) as ArrayList<Int>
            adapter.setItems(itemArray)
        } else {
            adapter.setItems(itemArray)
        }
    }
    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        savedInstanceState.putIntegerArrayList(ITEM_ARRAY_KEY, adapter.getItems())
        super.onSaveInstanceState(savedInstanceState)
    }
}