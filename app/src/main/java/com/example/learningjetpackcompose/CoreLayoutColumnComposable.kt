package com.example.learningjetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

//Kotlin has 3 Core layouts
// 1.Column, 2.Row, 3.BOX

//Column Composable basically use when you want to show elements as a list format as vertically mode

@Composable
fun ColumnExample(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text("Hello Rajdeep")
        Text("Hello Ranja")
        Button(onClick = {}) {
            Text("Do Something..")
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun ColumnPreview(modifier: Modifier = Modifier) {
    ColumnExample()
}