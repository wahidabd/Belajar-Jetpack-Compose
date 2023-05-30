package com.wahidabd.composeui.ui.navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.wahidabd.composeui.presentation.screen.MainScreen
import com.wahidabd.composeui.presentation.screen.onboarding.OnBoardingScreen
import com.wahidabd.composeui.presentation.screen.splash.SplashScreen
import com.wahidabd.composeui.ui.navigation.screen.Screen


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


@Composable
fun RootNavigationGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Screen.Splash.route
    ){
        composable(route = Screen.Splash.route){
            SplashScreen(navController = navController)
        }

        composable(route = Screen.OnBoarding.route){
            OnBoardingScreen(navController = navController)
        }

        composable(route = Graph.MAIN){
            MainScreen()
        }
    }
}