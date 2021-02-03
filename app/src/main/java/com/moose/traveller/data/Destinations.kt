package com.moose.traveller.data

import androidx.annotation.DrawableRes

data class Destination(val name: String, val country: String, @DrawableRes val image: Int)

object Destinations {
}