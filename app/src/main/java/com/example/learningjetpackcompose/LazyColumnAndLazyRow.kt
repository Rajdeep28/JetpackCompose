package com.example.learningjetpackcompose

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// When the number of data is huge we always show that list in xml in Recyclerview but Jetpack Compose We show that in Lazy Column and Lazy Row.

//LazyColumn for Vertical recyclerview and LazyRow for Horizontal Recyclerview
@Composable
fun LazyColumnExample(modifier: Modifier = Modifier) {
    LazyColumn {
        items(count = 50) { index ->
            Text("Item $index", modifier = Modifier.padding(8.dp))
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun LazyColumnPrev(modifier: Modifier = Modifier) {
    LazyColumnExample()
}