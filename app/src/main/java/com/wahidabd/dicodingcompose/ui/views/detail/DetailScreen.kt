package com.wahidabd.dicodingcompose.ui.views.detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.wahidabd.dicodingcompose.core.Resource
import com.wahidabd.dicodingcompose.di.Injection
import com.wahidabd.dicodingcompose.di.ViewModelCourseFactory
import com.wahidabd.dicodingcompose.ui.views.MainViewModel
import com.wahidabd.dicodingcompose.R
import com.wahidabd.dicodingcompose.data.model.Course
import com.wahidabd.dicodingcompose.data.model.Syllabus
import com.wahidabd.dicodingcompose.ui.components.*
import com.wahidabd.dicodingcompose.ui.theme.*

@Composable
fun DetailScreen(
    navController: NavController,
    id: Int,
    viewModel: MainViewModel = androidx.lifecycle.viewmodel.compose.viewModel(
        factory = ViewModelCourseFactory(
            Injection.provideCourseRepository()
        )
    )
) {
    val openId by viewModel.openId.collectAsState()
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = White2)
    ) {
        item {
            viewModel.detail.collectAsState(initial = Resource.Loading).value.let { state ->
                when (state) {
                    is Resource.Loading -> {
                        viewModel.getById(id)
                    }
                    is Resource.Error -> {
                        Text(text = stringResource(id = R.string.error))
                    }
                    is Resource.Success -> {
                        ImageBanner(navController = navController, image = state.data.image)
                        DescriptionCourse(detail = state.data)
                        SyllabusCourse(openSyllabus = openId, viewModel = viewModel, data = state.data.syllabus)
                    }
                }
            }
        }
    }
}

@Composable
fun ImageBanner(navController: NavController, image: String) {
    Box {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(image)
                .crossfade(true)
                .build(),
            contentDescription = image,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = { navController.popBackStack() },
                colors = ButtonDefaults.buttonColors(containerColor = White, contentColor = Dark)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_arrow_back),
                        contentDescription = "Back"
                    )
                    Text(text = "Back")
                }
            }
        }
    }
}

@Composable
fun DescriptionCourse(detail: Course) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        colors = CardDefaults.cardColors(containerColor = White)
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = detail.path.name,
                    style = MaterialTheme.typography.labelMedium.copy(
                        color = MaximumYellowRed,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 12.sp
                    )
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_groups),
                        modifier = Modifier
                            .width(16.dp)
                            .size(24.dp),
                        tint = Ruby,
                        contentDescription = "students"
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = detail.students,
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Medium,
                            color = Dark,
                            lineHeight = 0.sp
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = detail.title,
                style = MaterialTheme.typography.titleMedium.copy(
                    color = Dark,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
            Spacer(modifier = Modifier.height(12.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Time(time = detail.time)
                Module(module = detail.module)
                Level(level = detail.level)
            }
            Spacer(modifier = Modifier.height(12.dp))
            ExpandedDescription(text = detail.description)
        }
    }
}

@Composable
fun SyllabusCourse(
    openSyllabus: Int,
    viewModel: MainViewModel,
    data: List<Syllabus>
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = "Silabus Kelas",
            style = MaterialTheme.typography.bodyMedium.copy(
                fontWeight = FontWeight.SemiBold
            )
        )
        data.forEach { item ->
            CardSyllabus(
                item = item,
                onItemClick = {viewModel.setOpenSyllabus(item.id)},
                expanded = openSyllabus == item.id
            )
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DetailScreenPreview() {
    DetailScreen(navController = rememberNavController(), id = 1)
}