package com.sspd.client

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sspd.client.models.Course
import com.sspd.client.ui.theme.PurpleGrey40
import com.sspd.client.viewModel.CourseViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            setContent {
                Text("Hello World")
            }
        }
    }
}


//@Composable
//fun CourseScreen(
//    viewModel: CourseViewModel = viewModel(),
//    paddingValues: PaddingValues = PaddingValues(0.dp)
//) {
//    val courses by viewModel.courses
//
//    // load courses once
//    LaunchedEffect(Unit) {
//        viewModel.courses
//    }
//
//    if (courses.isEmpty()) {
//        // Loading indicator in the center
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(paddingValues),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            CircularProgressIndicator()
//        }
//    } else {
//        LazyColumn(
//            contentPadding = paddingValues,
//            verticalArrangement = Arrangement.spacedBy(8.dp),
//            modifier = Modifier.padding(5.dp)
//        ) {
//            items(courses) { course ->
//                ItemLi(course)
//            }
//        }
//    }
//}
//
//@Composable
//fun ItemLi(course: Course) {
//    Card(
//        modifier = Modifier.fillMaxWidth(),
//        colors = CardDefaults.cardColors(containerColor = PurpleGrey40)
//    ) {
//        Column(modifier = Modifier.padding(16.dp)) {
//            Text(text = "Course ID : ${course.courseId}")
//            Text(text = "Course Name : ${course.courseName}")
//            Text(text = "Description : ${course.description ?: "N/A"}")
//            Text(text = "Duration : ${course.duration} hours")
//            Text(text = "Fee : ${course.fee} MMK")
//        }
//    }
//}



