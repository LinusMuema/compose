package com.moose.traveller.data

import androidx.annotation.DrawableRes
import com.moose.traveller.R

data class Country(val name: String, val places: Int, @DrawableRes val image: Int)

object Countries {
    private val scotland = Country("Scotland", 24, R.drawable.scotland)
    private val spain = Country("Spain", 7, R.drawable.spain)
    private val newZealand = Country("New Zealand",10, R.drawable.new_zealand)
    private val germany = Country("Germany", 19, R.drawable.germany)

    fun getData(): List<Country> = listOf(scotland, spain, newZealand, germany)
}