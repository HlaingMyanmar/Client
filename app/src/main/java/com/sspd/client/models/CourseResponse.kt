package com.sspd.client.models

import kotlinx.serialization.Serializable

@Serializable
data class CourseResponse(
    val courses: List<Course>
)
