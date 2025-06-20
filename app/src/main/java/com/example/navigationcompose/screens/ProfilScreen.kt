package com.example.navigationcompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ProfilScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Text(
            "Screen 4",
            style = MaterialTheme
                .typography
                .headlineLarge,
            color = Color.White
        )
    }
}


@Preview
@Composable
fun Screen4Preview() {
    Scaffold { innerPadding ->
        ProfilScreen(modifier = Modifier.padding(innerPadding))
    }
}



// LES ECRANS