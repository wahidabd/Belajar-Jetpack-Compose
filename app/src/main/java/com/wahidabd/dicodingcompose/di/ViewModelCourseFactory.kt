package com.wahidabd.dicodingcompose.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.wahidabd.dicodingcompose.data.repository.CourseRepository
import com.wahidabd.dicodingcompose.ui.views.MainViewModel

class ViewModelCourseFactory(private val repository: CourseRepository) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(repository) as T
        }
        throw  java.lang.IllegalArgumentException("Unknown View Model")
    }
}