package com.wahidabd.composeui.ui.navigation.screen


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


sealed class Screen(val route: String) {
    object Splash : Screen("splash_screen")
    object OnBoarding : Screen("on_boarding_screen")
    object Search : Screen("search_screen")
    object Detail : Screen("detail_screen/{productId}") {
        fun passProductId(productId: Int): String = "detail_screen/$productId"
    }
}