package com.sanjaydevtech.recyclerviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import coil.load

class FoodActivity : AppCompatActivity() {

    private lateinit var recipeTitle: TextView
    private lateinit var recipeRating: TextView
    private lateinit var recipeImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        recipeTitle = findViewById(R.id.recipe_title_text)
        recipeRating = findViewById(R.id.recipe_rating_text)
        recipeImage = findViewById(R.id.recipe_img)

        val title = intent.getStringExtra("title")
        val img = intent.getStringExtra("img")
        val rating = intent.getDoubleExtra("rating", 0.0)

        recipeTitle.text = title
        recipeRating.text = rating.toString()
        recipeImage.load(img)
    }
}