package com.example.learningjetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RowExample(modifier: Modifier = Modifier) {
    Row(modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center) {
        Text("Hello Rajdeep")
        Text("Hello Ranja")
        Button(onClick = {}) {
            Text("Do Something..")
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun RowPreview(modifier: Modifier = Modifier) {
    RowExample()
}