package com.example.meditationappui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.meditationappui.ui.theme.DeepBlue

@Composable
fun DetailScreen(featureName: String?){
    Box(modifier = Modifier
        .background(DeepBlue)
        .fillMaxSize()
    ) {
        Text(text = featureName.toString())
    }
}