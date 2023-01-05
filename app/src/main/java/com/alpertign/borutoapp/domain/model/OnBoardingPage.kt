package com.alpertign.borutoapp.domain.model

import android.media.Image
import com.alpertign.borutoapp.R

/**
 * Created by Alperen Acikgoz on 05,January,2023
 */
sealed class OnBoardingPage(
    val image: Int,
    val title: String,
    val description: String
){
    object First: OnBoardingPage(
        image = R.drawable.greetings,
        title = "Greetings",
        description = "Are you a Boruto fan? Because if you are we have a great news for you!"
    )
    object Second: OnBoardingPage(
        image = R.drawable.explore,
        title = "Explore",
        description = "Find your favourite heroes and learn some of the things that you didn't know about."
    )
    object Third: OnBoardingPage(
        image = R.drawable.power,
        title = "Power",
        description = "Check out your hero's power and see how much are they strong comparing to others."
    )
}
