package com.wahidabd.composeui.presentation.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.wahidabd.composeui.presentation.component.BottomBar
import com.wahidabd.composeui.ui.navigation.graph.MainNavGraph
import com.wahidabd.composeui.ui.theme.DIMENS_16dp
import com.wahidabd.composeui.ui.theme.DIMENS_32dp


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    navController: NavHostController = rememberNavController()
) {

    Scaffold(
        bottomBar = {
            Surface(
                shadowElevation = DIMENS_32dp,
                shape = RoundedCornerShape(topStart = DIMENS_16dp, topEnd = DIMENS_16dp)
            ) {
                BottomBar(navController = navController)
            }
        }
    ) {
        Column(
            modifier = Modifier.padding(it)
        ) {
            MainNavGraph(navController = navController)
        }
    }

}