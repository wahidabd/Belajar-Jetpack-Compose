package com.wahidabd.dicodingcompose.ui.views

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.wahidabd.dicodingcompose.navigation.Routes
import com.wahidabd.dicodingcompose.ui.views.auth.LoginScreen
import com.wahidabd.dicodingcompose.ui.views.auth.RegisterScreen
import com.wahidabd.dicodingcompose.ui.views.search.SearchScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StartScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    Scaffold {
        val padding = it
        NavHost(navController = navController, startDestination = Routes.Main.route){
            composable(Routes.Main.route){
                MainScreen()
            }
        }
    }
}