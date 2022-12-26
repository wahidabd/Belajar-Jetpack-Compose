package com.wahidabd.dicodingcompose.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.wahidabd.dicodingcompose.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem(Routes.Home.route, R.drawable.ic_home, "Home")
    object Profile : NavigationItem(Routes.Profile.route, R.drawable.ic_profile, "Profile")
}