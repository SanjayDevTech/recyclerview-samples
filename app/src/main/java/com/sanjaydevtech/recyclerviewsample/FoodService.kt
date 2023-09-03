package com.sanjaydevtech.recyclerviewsample

import retrofit2.http.GET

interface FoodService {
    @GET("foods.json")
    suspend fun getFoods(): List<Food>
}