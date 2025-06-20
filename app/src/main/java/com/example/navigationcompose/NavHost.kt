package com.example.navigationcompose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navigationcompose.destinations.ProfileScreen
import com.example.navigationcompose.destinations.HomeScreen
import com.example.navigationcompose.destinations.MessagesScreen
import com.example.navigationcompose.destinations.ResearchScreen
import com.example.navigationcompose.screens.HomeScreen
import com.example.navigationcompose.screens.ResearchScreen
import com.example.navigationcompose.screens.MessagesScreen
import com.example.navigationcompose.screens.ProfilScreen


// NAVHOST + NAVBAR


@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    moveToScreen3Action: () -> Unit
) {
    NavHost(
        navController = navController,
        startDestination = HomeScreen.route,
        modifier = modifier
    ) {
        composable(route = HomeScreen.route) {
            HomeScreen(onActionMoveToScreen3 = {
                moveToScreen3Action()
            })
        }

        composable(route = ResearchScreen.route) {
            ResearchScreen()
        }

        composable(route = MessagesScreen.route) {
            MessagesScreen()
        }

        composable(route = ProfileScreen.route) {
            ProfilScreen()
        }
    }
}

// 1 - Ne pas recréer plusieurs fois le meme écran si on clique plusieurs fois sur la meme NavTab
// 2 - Restaurer le dernier état de l'écran ou on va
// 3 - Sauvergarder le dernier état de l'écran duquel on part
fun NavHostController.navigateSingleToTop(route: String) =
    this.navigate(route) {
        popUpTo(
            // Netooyer la pile jusqu' à lécran de "startDestiantion"
            this@navigateSingleToTop.graph.findStartDestination().id
        ) {
            saveState = true // Sauvegarde de l'état du screen (scroll, saisie de texte, etc
        }
        launchSingleTop = true // Pour ne pas recréer l'écran sur lequel on est
        restoreState = true // Restaure le dernier état de l'écran ou je vais naviguer
    }