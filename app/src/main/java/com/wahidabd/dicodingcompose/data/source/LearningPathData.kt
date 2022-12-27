package com.wahidabd.dicodingcompose.data.source

import androidx.compose.ui.graphics.Color
import com.wahidabd.dicodingcompose.R
import com.wahidabd.dicodingcompose.data.model.LearningPath
import com.wahidabd.dicodingcompose.ui.theme.*

object LearningPathData {

    val list = listOf(
        LearningPath(
            1,
            "Android",
            R.drawable.android,
            Color.Green
        ),
        LearningPath(
            2,
            "IOS",
            R.drawable.apple,
            Ruby
        ),
        LearningPath(
            3,
            "Front-End",
            R.drawable.coding,
            MaximumYellowRed
        ),
        LearningPath(
            4,
            "ML",
            R.drawable.robot,
            Dark
        ),
        LearningPath(
            5,
            "React",
            R.drawable.react,
            Blue
        ),
        LearningPath(
            6,
            "Back-End",
            R.drawable.server,
            QuinacridoneMagenta
        )
    )

}