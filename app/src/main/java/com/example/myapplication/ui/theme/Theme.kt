package com.example.myapplication.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState


@Composable
fun MyApplicationTheme(
    darkTheme: MutableState<Boolean>,
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme.value) {
        DarkColors
    } else {
        LightColors
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}