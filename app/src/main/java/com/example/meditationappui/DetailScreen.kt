package com.example.meditationappui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.meditationappui.ui.theme.DeepBlue

@Composable
fun DetailScreen(featureName: String?){
    Box(modifier = Modifier
        .background(DeepBlue)
        .fillMaxSize()
    ) {
        //Text(text = featureName.toString())
        Column{
            BackAndFavoriteSection()
        }
    }
}

@Composable
fun BackAndFavoriteSection(){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_back),
            contentDescription = "Search",
            tint = Color.White,
            modifier = Modifier.size(32.dp)
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_star),
            contentDescription = "Search",
            tint = Color.White,
            modifier = Modifier.size(32.dp)
        )
    }
}

