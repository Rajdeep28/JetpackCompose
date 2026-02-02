package com.example.learningjetpackcompose

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp

@Composable
fun CounterScreen() {
    /*var count = 0*/ // here is wrong because everytime we press the increase button It will show 0

    var counter by remember { mutableStateOf(0) }

    Text(text = "$counter", modifier = Modifier.padding(16.dp), color = colorResource(R.color.teal_200))

    Button(onClick = {
        counter++
    }) {
        Text("increase")
    }
}