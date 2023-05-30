package com.wahidabd.composeui.presentation.component

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.wahidabd.composeui.ui.navigation.screen.BottomNavItem
import com.wahidabd.composeui.ui.theme.Green


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


@Composable
fun BottomBar(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    val navigationItems = listOf(
        BottomNavItem.Home,
        BottomNavItem.Explore,
        BottomNavItem.Cart,
        BottomNavItem.About
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    val bottomBarDestination = navigationItems.any { it.route == currentRoute }

    if (bottomBarDestination){
        BottomNavigation(
            backgroundColor = Color.White,
            contentColor = Color.Black,
            modifier = modifier
        ) {
            navigationItems.forEach { item ->
                BottomNavigationItem(
                    icon = {
                        Icon(imageVector = item.icon, contentDescription = item.title)
                    },
                    label = {
                        Text(
                            text =  item.title,
                            fontWeight = FontWeight.SemiBold,
                            color = if (currentRoute == item.route) Green else Color.Black.copy(0.4f)
                        )
                    },
                    selected = currentRoute == item.route,
                    selectedContentColor = Green,
                    unselectedContentColor = Color.Black.copy(0.4f),
                    onClick = {
                        navController.navigate(item.route){
                            navController.graph.startDestinationRoute?.let { screen ->
                                popUpTo(screen){
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    }
                )
            }
        }
    }
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun BottomBarPreview() {
    BottomBar(navController = rememberNavController())
}