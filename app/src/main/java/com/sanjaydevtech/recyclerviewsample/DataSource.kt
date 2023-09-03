package com.sanjaydevtech.recyclerviewsample

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object DataSource {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://json-placeholder-static.onrender.com/")
        .addConverterFactory(MoshiConverterFactory.create(
            Moshi.Builder().addLast(KotlinJsonAdapterFactory()).build()
        ))
        .build()

    private val foodService = retrofit.create(FoodService::class.java)
    suspend fun getFoodList(): List<Food> {
        return foodService.getFoods()
    }
}