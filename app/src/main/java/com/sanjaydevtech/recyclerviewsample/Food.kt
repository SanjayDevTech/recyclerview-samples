package com.sanjaydevtech.recyclerviewsample

import androidx.annotation.DrawableRes

data class Food(
    val title: String,
    val rating: Double,
    @DrawableRes val imgResId: Int,
)