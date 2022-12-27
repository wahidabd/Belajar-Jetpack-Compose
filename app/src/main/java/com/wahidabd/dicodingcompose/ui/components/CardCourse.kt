package com.wahidabd.dicodingcompose.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.wahidabd.dicodingcompose.data.model.Course
import com.wahidabd.dicodingcompose.R
import com.wahidabd.dicodingcompose.ui.theme.*

@Composable
fun CardCourse(modifier: Modifier = Modifier, item: Course, onClick: (Int) -> Unit) {
    Box(
        modifier = modifier
            .clip(shape = RoundedCornerShape(16.dp))
            .background(color = Color.White)
            .border(
                BorderStroke(1.4.dp, SolidColor(SoftGray)),
                shape = RoundedCornerShape(16.dp)
            )
            .padding(bottom = 14.dp)
            .clickable(
                indication = null,
                interactionSource = remember { MutableInteractionSource() }
            ) {
                onClick(item.id)
            }
    ) {
        Column {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(item.image)
                    .crossfade(true).build(),
                contentDescription = item.title,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(
                        shape = RoundedCornerShape(12.dp)
                    )
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = item.title,
                modifier = Modifier.padding(horizontal = 12.dp),
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                )
            )
            Spacer(modifier = Modifier.height(6.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Time(time = item.time)
                Module(module = item.module)
                Level(level = item.level)
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = item.description,
                modifier = Modifier.padding(horizontal = 12.dp),
                overflow = TextOverflow.Ellipsis,
                maxLines = 4,
                style = MaterialTheme.typography.bodySmall.copy(
                    fontWeight = FontWeight.Normal,
                    color = SoftGray2
                )
            )
            Path(path = item.path.name)
        }
    }
}

@Composable
fun Path(path: String) {
    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(horizontal = 12.dp)) {
        Icon(
            painter = painterResource(id = R.drawable.ic_path),
            modifier = Modifier
                .width(16.dp)
                .size(24.dp),
            tint = Color.DarkGray,
            contentDescription = "level"
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = path,
            style = MaterialTheme.typography.labelSmall.copy(
                fontSize = 11.sp,
                fontWeight = FontWeight.Medium,
                color = SoftGray2,
                lineHeight = 0.sp
            )
        )
    }
}


@Composable
fun Level(level: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            painter = painterResource(id = R.drawable.ic_level),
            modifier = Modifier
                .width(16.dp)
                .size(24.dp),
            tint = Blue,
            contentDescription = "level"
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = level,
            style = MaterialTheme.typography.labelSmall.copy(
                fontSize = 11.sp,
                fontWeight = FontWeight.Medium,
                color = SoftGray2,
                lineHeight = 0.sp
            )
        )
    }
}

@Composable
fun Time(time: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            painter = painterResource(id = R.drawable.ic_clock),
            modifier = Modifier
                .width(16.dp)
                .size(24.dp),
            tint = Color.Cyan,
            contentDescription = "time"
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = time,
            style = MaterialTheme.typography.labelSmall.copy(
                fontSize = 11.sp,
                fontWeight = FontWeight.Medium,
                color = SoftGray2,
                lineHeight = 0.sp
            )
        )
    }
}

@Composable
fun Module(module: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            painter = painterResource(id = R.drawable.ic_module),
            modifier = Modifier
                .width(16.dp)
                .size(24.dp),
            tint = BlueShade,
            contentDescription = "module"
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = module,
            style = MaterialTheme.typography.labelSmall.copy(
                fontSize = 11.sp,
                fontWeight = FontWeight.Medium,
                color = SoftGray2,
                lineHeight = 0.sp
            )
        )
    }
}