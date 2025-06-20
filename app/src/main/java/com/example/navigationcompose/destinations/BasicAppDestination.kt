package com.example.navigationcompose.destinations

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

// DESTINATIONS

interface BasicAppDestination {
    val icon: ImageVector
    val name: String
    val route: String
}


object ScreenOne: BasicAppDestination {
    override val icon = Icons.Default.Home
    override val name: String = "Screen1"
    override val route: String = "screens/1"
}

object ScreenTwo: BasicAppDestination {
    override val icon = Icons.Default.Build
    override val name: String = "Screen2"
    override val route: String = "screens/2"
}

object ScreenThree: BasicAppDestination {
    override val icon = Icons.Default.Person
    override val name: String = "Screen3"
    override val route: String = "screens/3"
}

object ScreenFour: BasicAppDestination {
    override val icon = Icons.Default.Face
    override val name: String = "Screen4"
    override val route: String = "screens/4"
}

val navTabs = listOf(ScreenOne, ScreenTwo, ScreenThree, ScreenFour)