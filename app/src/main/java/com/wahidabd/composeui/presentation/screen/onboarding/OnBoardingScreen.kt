package com.wahidabd.composeui.presentation.screen.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.wahidabd.composeui.R
import com.wahidabd.composeui.ui.navigation.graph.Graph
import com.wahidabd.composeui.ui.theme.GilroyFontFamily
import com.wahidabd.composeui.ui.theme.Green
import com.wahidabd.composeui.ui.theme.TEXT_SIZE_18sp
import org.koin.androidx.compose.koinViewModel


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


@Composable
fun OnBoardingScreen(
    navController: NavHostController,
    viewModel: OnBoardingViewModel = koinViewModel()
) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.img_onboarding),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Surface(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 90.dp),
            color = Color.Transparent
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(id = R.string.welcome_to_store),
                    fontFamily = GilroyFontFamily,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 49.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = stringResource(id = R.string.desc_welcome),
                    fontFamily = GilroyFontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(40.dp))
                Button(
                    onClick = {
                        navController.popBackStack()
                        navController.navigate(Graph.MAIN)
                        viewModel.saveOnBoardingState(true)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(68.dp)
                        .padding(horizontal = 16.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Green),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text(
                        text = stringResource(R.string.get_started),
                        fontFamily = GilroyFontFamily,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = TEXT_SIZE_18sp,
                        color = Color.White
                    )
                }
            }
        }
    }
}