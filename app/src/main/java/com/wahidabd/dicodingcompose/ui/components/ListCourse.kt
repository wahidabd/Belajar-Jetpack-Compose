package com.wahidabd.dicodingcompose.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.wahidabd.dicodingcompose.R
import com.wahidabd.dicodingcompose.data.model.Course
import com.wahidabd.dicodingcompose.navigation.Routes

@Composable
fun ListCourse(
    modifier: Modifier = Modifier,
    courses: List<Course>,
    navController: NavController
) {
    Column(modifier = modifier) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "All Courses",
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.Bold
                )
            )
            Icon(painter = painterResource(id = R.drawable.ic_more), contentDescription = "more")
        }
        Spacer(modifier = Modifier.height(20.dp))
        courses.forEachIndexed { _, course ->
            CardCourse(
                item = course,
                modifier = Modifier.padding(
                    start = 16.dp,
                    end = 16.dp,
                ),
                onClick = {
                    navController.navigate(Routes.Detail.createRoute(course.id))
                }
            )
            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}