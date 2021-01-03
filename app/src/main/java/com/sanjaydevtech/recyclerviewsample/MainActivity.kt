package com.sanjaydevtech.recyclerviewsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var foodListView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        foodListView = findViewById(R.id.food_recipes_list)
        foodListView.layoutManager = LinearLayoutManager(this)

        val adapter = FoodListAdapter(this, DataSource.getFoodList())

        foodListView.adapter = adapter
    }
}