package com.wahidabd.composeui.ui.navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.google.accompanist.pager.ExperimentalPagerApi
import com.wahidabd.composeui.presentation.screen.about.AboutScreen
import com.wahidabd.composeui.presentation.screen.cart.CartScreen
import com.wahidabd.composeui.presentation.screen.detail.DetailScreen
import com.wahidabd.composeui.presentation.screen.explore.ExploreScreen
import com.wahidabd.composeui.presentation.screen.home.HomeScreen
import com.wahidabd.composeui.presentation.screen.search.SearchScreen
import com.wahidabd.composeui.ui.navigation.screen.BottomNavItem
import com.wahidabd.composeui.ui.navigation.screen.Screen
import com.wahidabd.composeui.utils.Constant.PRODUCT_ARGUMENT_KEY


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


@ExperimentalPagerApi
@Composable
fun MainNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        route = Graph.MAIN,
        startDestination = BottomNavItem.Home.route
    ) {
        composable(route = BottomNavItem.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(route = BottomNavItem.Explore.route) {
            ExploreScreen()
        }
        composable(route = BottomNavItem.Cart.route) {
            CartScreen()
        }
        composable(route = BottomNavItem.About.route) {
            AboutScreen()
        }

        searchNavGraph()
        detailNavGraph()
    }

}

fun NavGraphBuilder.detailNavGraph() {
    navigation(
        route = Graph.DEATIL,
        startDestination = Screen.Detail.route
    ) {
        composable(
            route = Screen.Detail.route,
            arguments = listOf(navArgument(PRODUCT_ARGUMENT_KEY) {
                type = NavType.IntType
            })
        ) {
            DetailScreen()
        }
    }
}

fun NavGraphBuilder.searchNavGraph() {
    navigation(
        route = Graph.SEARCH,
        startDestination = Screen.Search.route
    ) {
        composable(route = Screen.Search.route) {
            SearchScreen()
        }
    }
}