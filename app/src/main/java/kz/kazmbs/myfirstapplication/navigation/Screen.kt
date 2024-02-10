package kz.kazmbs.myfirstapplication.navigation

sealed class Screen(val route: String) {

    object FirstScreen: Screen("first_screen")

    object SecondScreen: Screen("second_screen")

    object ThirdScreen: Screen("third_screen") {

        fun thirdScreenWithArgsRoute() : String {
            return "$route/{word}"
        }

        fun thirdScreenWithArgs(word: String) : String {
            return "$route/$word"
        }
    }

    object MainScreen: Screen("main_screen")

    object ServiceScreen: Screen("service_screen")

    object MessengerScreen: Screen("messenger_screen")
}
