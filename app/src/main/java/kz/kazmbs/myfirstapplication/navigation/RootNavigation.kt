package kz.kazmbs.myfirstapplication.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import kz.kazmbs.myfirstapplication.R
import kz.kazmbs.myfirstapplication.presentation.first_screen.FirstScreen
import kz.kazmbs.myfirstapplication.presentation.second_screen.SecondScreen
import kz.kazmbs.myfirstapplication.presentation.second_screen.ThirdScreen

@Composable
fun RootNavigation(
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = Screen.FirstScreen.route,
    ) {

        composable(route = Screen.FirstScreen.route) {
            FirstScreen(navigateToNext = {
                navController.navigate(Screen.ThirdScreen.thirdScreenWithArgs(it))
            })
        }

        composable(route = Screen.SecondScreen.route) {
            SecondScreen(
                onBackPressed = {
                    navController.popBackStack()
                },
                navigateToNext = {
                    navController.navigate(Screen.ThirdScreen.route)
                }
            )
        }

        composable(route = Screen.ThirdScreen.thirdScreenWithArgsRoute()) {backStackEntry ->
            ThirdScreen(
                word = backStackEntry.arguments?.getString("word") ?: "",
                onBackPressed = {
                    navController.popBackStack()
                }
            )
        }

    }
}