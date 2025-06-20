package com.example.navigationcompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
fun HomeScreen(
    modifier: Modifier = Modifier,
    onActionMoveToScreen3: () -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Red),
        contentAlignment = Alignment.Center
    ) {
        Text(
            "Screen 1",
            style = MaterialTheme
                .typography
                .headlineLarge,
            color = Color.White,
            modifier = Modifier.clickable { onActionMoveToScreen3() }
        )
    }
}


@Preview
@Composable
fun Screen1Preview() {
    Scaffold { innerPadding ->
        HomeScreen(modifier = Modifier.padding(innerPadding), onActionMoveToScreen3 = {})
    }
}