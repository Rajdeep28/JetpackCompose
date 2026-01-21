package com.example.learningjetpackcompose

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Greet(name: String) {
    Text("Hello $name")
}