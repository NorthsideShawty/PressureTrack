package com.northside_shawty.pressuretrack.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = ""
    ) {
//        composable(Screen.PasswordScreen.route) { PasswordScreen(navController) }
//        composable(Screen.RegistrationScreen.route) { RegScreen(navController) }
//        composable(Screen.AuthScreen.route) { AuthScreen(navController) }
//        composable(Screen.RegistrationSuccess.route) { RegSuccessScreen(navController) }
//        composable(Screen.ChooseSessionScreen.route) { ChooseSessionScreen(navController) }
//        composable(Screen.SessionScreen.route) { SessionScreen(navController) }
    }
}
