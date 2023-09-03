package com.sanjaydevtech.recyclerviewsample

import com.squareup.moshi.Json

data class Food(
    val id: String,
    val title: String,
    val rating: Double,

    @Json(name = "img")
    val image: String,
)