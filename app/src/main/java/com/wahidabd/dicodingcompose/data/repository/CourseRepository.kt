package com.wahidabd.dicodingcompose.data.repository

import com.wahidabd.dicodingcompose.data.model.Course
import com.wahidabd.dicodingcompose.data.model.LearningPath
import com.wahidabd.dicodingcompose.data.source.CourseData
import com.wahidabd.dicodingcompose.data.source.LearningPathData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map

class CourseRepository {

    fun getCourses(): Flow<List<Course>> =
        flowOf(CourseData.list)

    fun searchCourses(query: String): Flow<List<Course>> =
        flowOf(CourseData.list).map { item ->
            item.filter {
                it.title.contains(query, ignoreCase = true)
            }
        }

    fun coursePath(id: Int): Flow<List<Course>> =
        flowOf(CourseData.list).map { item ->
            item.filter {
                it.path.id == id
            }
        }

    fun getLearningPath(): Flow<List<LearningPath>> =
        flowOf(LearningPathData.list)

    fun getById(id: Int): Course =
        CourseData.list.first {
            it.id == id
        }

    companion object {
        @Volatile
        private var instance: CourseRepository? = null

        fun getInstance(): CourseRepository = instance ?: synchronized(this) {
            CourseRepository().apply {
                instance = this
            }
        }
    }

}