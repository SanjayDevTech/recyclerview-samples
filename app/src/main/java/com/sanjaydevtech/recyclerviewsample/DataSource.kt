package com.sanjaydevtech.recyclerviewsample

object DataSource {
    fun getFoodList(): List<Food> {
        return listOf(
            Food("Chocolate", 4.7, R.drawable.chocolate),
            Food("Cake", 4.4, R.drawable.cake),
            Food("French fries", 4.5, R.drawable.fries),
            Food("Pizza", 4.1, R.drawable.pizza),
            Food("Hamburger", 4.6, R.drawable.hamburger),
            Food("Popcorn", 4.8, R.drawable.popcorn),
            Food("Candy", 4.5, R.drawable.candy),
        )
    }
}