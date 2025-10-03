package com.sspd.client.models

import kotlinx.serialization.Serializable

@Serializable
data class Course(
    val courseId: Int = 0,
    val courseName: String,
    val description: String? = null,
    val duration: Double,
    val fee: Int
)


