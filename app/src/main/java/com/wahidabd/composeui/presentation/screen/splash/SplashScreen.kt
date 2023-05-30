package com.wahidabd.composeui.presentation.screen.splash

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.wahidabd.composeui.R
import com.wahidabd.composeui.ui.navigation.graph.Graph
import com.wahidabd.composeui.ui.navigation.screen.Screen
import com.wahidabd.composeui.ui.theme.Green
import kotlinx.coroutines.delay
import org.koin.androidx.compose.koinViewModel


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


@Composable
fun SplashScreen(
    navController: NavHostController,
    viewModel: SplashViewModel = koinViewModel()
) {
    val onBoardingCompleted by viewModel.onBoarding.collectAsState()
    val scale = remember { Animatable(0f) }

    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.8f,
            animationSpec = tween(
                durationMillis = 800,
                easing = {
                    OvershootInterpolator(4f).getInterpolation(it)
                }
            )
        )
        delay(1200L)
        navController.popBackStack()

        if (onBoardingCompleted) navController.navigate(Graph.MAIN)
        else navController.navigate(Screen.OnBoarding.route)
    }

    Splash(scale = scale.value)
}

@Composable
fun Splash(modifier: Modifier = Modifier, scale: Float) {
    Box(
        modifier = modifier
            .background(Green)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier
                .scale(scale)
                .padding(all = 64.dp),
            painter = painterResource(id = R.drawable.img_logo_app),
            contentDescription = stringResource(id = R.string.logo_app)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SplashScreenPreview() {
    Splash(scale = 0f)
}