package com.example.learningjetpackcompose

// Function that accepts arguments or return functions or both

fun main() {
calculator(4.0,5.0, ::sum)
}

fun sum(a: Double, b: Double): Double {
    return a + b
}

fun calculator(a: Double, b: Double, gn: (Double, Double) -> Double) {
    val result = gn(a, b)
    println(result)
}