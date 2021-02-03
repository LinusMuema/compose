package com.moose.traveller.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.moose.traveller.R

data class Country(val name: String, @DrawableRes val image: Int, @StringRes val description: Int)

object Countries {
    private val scotland = Country("Scotland",  R.drawable.scotland, R.string.scotland)
    private val spain = Country("Spain",  R.drawable.spain, R.string.spain)
    private val newZealand = Country("New Zealand", R.drawable.new_zealand, R.string.new_zealand)
    private val germany = Country("Germany",  R.drawable.germany,R.string.germany)

    fun getData(): List<Country> = listOf(scotland, spain, newZealand, germany)
}