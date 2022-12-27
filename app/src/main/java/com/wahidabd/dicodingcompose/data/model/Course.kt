package com.wahidabd.dicodingcompose.data.model

data class Course(
    val id: Int,
    val path: LearningPath,
    val title: String,
    val image: String,
    val level: String,
    val module: String,
    val time: String,
    val students: String,
    val description: String,
    val syllabus: List<Syllabus>
)