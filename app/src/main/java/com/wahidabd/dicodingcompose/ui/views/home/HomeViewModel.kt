package com.wahidabd.dicodingcompose.ui.views.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wahidabd.dicodingcompose.core.Resource
import com.wahidabd.dicodingcompose.data.model.Course
import com.wahidabd.dicodingcompose.data.repository.CourseRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class HomeViewModel (private val repository: CourseRepository) : ViewModel() {

    private val _resource: MutableStateFlow<Resource<List<Course>>> =
        MutableStateFlow(Resource.Loading)

    val resource: StateFlow<Resource<List<Course>>> get() =_resource

    private val _query = mutableStateOf("")
    val query: State<String> get() = _query

    fun courses() {
        viewModelScope.launch {
            repository.getCourses().catch {
                _resource.value = Resource.Error(it.message.toString())
            }.collect { course ->
                _resource.value = Resource.Success(course)
            }
        }
    }

    fun search(query: String) {
        _query.value = query
        viewModelScope.launch {
            repository.searchCourses(_query.value).catch {
                _resource.value = Resource.Error(it.message.toString())
            }.collect { course ->
                _resource.value = Resource.Success(course)
            }
        }
    }

    fun removeQuery() {
        _query.value = ""
        this.courses()
    }

}