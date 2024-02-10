package kz.kazmbs.myfirstapplication.navigation

import androidx.annotation.DrawableRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import kz.kazmbs.myfirstapplication.R

sealed class BottomNavScreen(
    val text: String,
    @DrawableRes val icon: Int,
    val route: String
) {

    object Main: BottomNavScreen(
        text = "Main",
        icon = R.drawable.ic_back_icon,
        route = Screen.MainScreen.route
    )

    object Service: BottomNavScreen(
        text = "Services",
        icon = R.drawable.ic_back_icon,
        route = Screen.ServiceScreen.route
    )

    object Messenger: BottomNavScreen(
        text = "Messenger",
        icon = R.drawable.ic_back_icon,
        route = Screen.MessengerScreen.route
    )

}

