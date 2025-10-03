package com.sspd.client.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import com.sspd.client.instance.RetrofitInstance
import com.sspd.client.models.Course
import kotlinx.coroutines.launch

class CourseViewModel : ViewModel() {
    private val _courses = mutableStateOf<List<Course>>(emptyList())
    val courses: State<List<Course>> = _courses

    fun loadCourses() {
        viewModelScope.launch {
            try {
                val result = RetrofitInstance.api.getCourses()
                _courses.value = result.courses
                // Log to check
                Log.d("CourseViewModel", "Courses fetched: $result")
            } catch (e: Exception) {
                e.printStackTrace()
                Log.e("CourseViewModel", "Error fetching courses: ${e.message}")
            }
        }
    }
}
