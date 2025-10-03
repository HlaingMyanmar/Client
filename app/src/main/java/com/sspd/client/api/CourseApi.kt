package com.sspd.client.api

import com.sspd.client.models.CourseResponse
import retrofit2.http.GET

interface CourseApi {
    @GET("courses")
    suspend fun getCourses(): CourseResponse
}