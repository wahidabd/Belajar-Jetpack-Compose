package com.wahidabd.composeui.ui.navigation.screen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


sealed class BottomNavItem(val route: String, val icon: ImageVector, val title: String) {
    object Home : BottomNavItem("home_screen", Icons.Default.Home, "Shop")
    object Explore : BottomNavItem("explore_screen", Icons.Default.Search, "Explore")
    object Cart : BottomNavItem("cart_screen", Icons.Default.ShoppingCart, "Cart")
    object About : BottomNavItem("about_screen", Icons.Default.Person, "About")
}