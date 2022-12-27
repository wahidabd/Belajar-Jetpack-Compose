package com.wahidabd.dicodingcompose.di

import com.wahidabd.dicodingcompose.data.repository.CourseRepository

object Injection {

    fun provideCourseRepository(): CourseRepository =
        CourseRepository.getInstance()

}