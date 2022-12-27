package com.wahidabd.dicodingcompose.ui.views

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.wahidabd.dicodingcompose.navigation.Routes
import com.wahidabd.dicodingcompose.ui.components.BottomNavigationBar
import com.wahidabd.dicodingcompose.ui.views.detail.DetailScreen
import com.wahidabd.dicodingcompose.ui.views.home.HomeScreen
import com.wahidabd.dicodingcompose.ui.views.profile.ProfileScreen
import com.wahidabd.dicodingcompose.ui.views.search.SearchScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavHostController = rememberNavController()) {

    val navBackStateEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStateEntry?.destination?.route

    Scaffold(bottomBar = {
        if (currentRoute != Routes.Detail.route && currentRoute != Routes.Search.route) {
            BottomNavigationBar(navController)
        }
    }) { paddingValues ->
        NavHost(navController = navController, startDestination = Routes.Home.route) {
            composable(Routes.Home.route) {
                HomeScreen(paddingValues = paddingValues, navController = navController)
            }
            composable(Routes.Profile.route) {
                ProfileScreen(navController = navController)
            }
            composable(Routes.Search.route) {
                SearchScreen(navController = navController)
            }
            composable(
                Routes.Detail.route,
                arguments = listOf(navArgument("id") { type = NavType.IntType })
            ) {
                val id = it.arguments?.getInt("id") ?: 0
                DetailScreen(navController = navController, id = id)
            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}