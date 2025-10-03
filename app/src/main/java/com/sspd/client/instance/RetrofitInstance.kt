package com.sspd.client.instance

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.sspd.client.api.CourseApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

object RetrofitInstance {
    private val json = Json { ignoreUnknownKeys = true }

    val api: CourseApi by lazy {
        Retrofit.Builder()
            .baseUrl("http://192.168.1.7:8080/")
            .addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
            .build()
            .create(CourseApi::class.java)
    }
}