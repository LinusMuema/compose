package com.moose.eats.data

import androidx.annotation.DrawableRes
import com.moose.eats.R

data class Food(
    val name: String,
    val price: Double,
    val rating: Double,
    @DrawableRes val image: Int
)


object Data {

    private val food = Food(name = "Chocolate cake", price = 2.5, rating = 4.0, image = R.drawable.chocolate)
    private val food2 = Food(name = "Beef roast", price = 4.0, rating = 4.8, image = R.drawable.beef)
    private val food3 = Food(name = "Lasagna", price = 3.4, rating = 3.8, image = R.drawable.lasagna)
    private val food4 = Food(name = "Burger (Special)", price = 2.0, rating = 3.0, image = R.drawable.burger)
    private val food5 = Food(name = "Fruit Pie", price = 5.0, rating = 3.9, image = R.drawable.pie)

    fun getFood(): List<Food> = listOf(food, food2, food3, food4, food5)
}