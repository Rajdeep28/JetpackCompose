package com.example.learningjetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BoxExample(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.bumblebee),
            contentDescription = null,
            modifier = Modifier.width(100.dp).height(100.dp).align(Alignment.Center)
        )
        Text("Overlay Text", color = Color.Black, modifier = Modifier.align(Alignment.Center))
    }
}

@Composable
@Preview
fun BoxPreview(modifier: Modifier = Modifier) {
    BoxExample()
}