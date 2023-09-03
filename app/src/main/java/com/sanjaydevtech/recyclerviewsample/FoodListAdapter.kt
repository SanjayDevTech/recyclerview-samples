package com.sanjaydevtech.recyclerviewsample

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import coil.load

class FoodListAdapter(private val context: Context) : RecyclerView.Adapter<FoodListAdapter.FoodViewHolder>() {

    var foodList: List<Food> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    class FoodViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val recipeTitle: TextView = view.findViewById(R.id.recipe_title_text)
        val recipeRating: TextView = view.findViewById(R.id.recipe_rating_text)
        val recipeImage: ImageView = view.findViewById(R.id.recipe_img)
        val container: CardView = view.findViewById(R.id.container)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val adapterView = LayoutInflater.from(parent.context).inflate(R.layout.food_item_view, parent, false)
        return FoodViewHolder(adapterView)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = foodList[position]
        holder.recipeTitle.text = food.title
        holder.recipeRating.text = food.rating.toString()
        holder.recipeImage.load(food.image)
        holder.container.setOnClickListener {
            val intent = Intent(context, FoodActivity::class.java).apply {
                putExtra("title", food.title)
                putExtra("img", food.image)
                putExtra("rating", food.rating)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return foodList.size
    }
}