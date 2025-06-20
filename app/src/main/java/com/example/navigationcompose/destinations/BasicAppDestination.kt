package com.example.navigationcompose.destinations

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

// DESTINATIONS

interface BasicAppDestination {
    val icon: ImageVector
    val name: String
    val route: String
}


object HomeScreen: BasicAppDestination {
    override val icon = Icons.Default.Home
    override val name: String = "Accueil"
    override val route: String = "screens/1"
}

object ResearchScreen: BasicAppDestination {
    override val icon = Icons.Default.Search
    override val name: String = "Recherche"
    override val route: String = "screens/2"
}

object MessagesScreen: BasicAppDestination {
    override val icon = Icons.Default.Email
    override val name: String = "Messagerie"
    override val route: String = "screens/3"
}

object ProfileScreen: BasicAppDestination {
    override val icon = Icons.Default.Face
    override val name: String = "Profil"
    override val route: String = "screens/4"
}

val navTabs = listOf(HomeScreen, ResearchScreen, MessagesScreen, ProfileScreen)