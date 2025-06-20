package com.example.navigationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.navigationcompose.composables.BasicNavBar
import com.example.navigationcompose.destinations.HomeScreen
import com.example.navigationcompose.destinations.MessagesScreen
import com.example.navigationcompose.destinations.navTabs
import com.example.navigationcompose.ui.theme.NavigationComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleNavApp()
        }
    }
}

@Composable
fun SimpleNavApp() {
    val navController = rememberNavController()

    val currentBackStack by navController.currentBackStackEntryAsState()
    val currentDestination = currentBackStack?.destination

    val currentScreen = navTabs.find { it.route == currentDestination?.route } ?: HomeScreen

    NavigationComposeTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            bottomBar = {
                BasicNavBar(
                    destinations = navTabs,
                    onTabSelected = { newScreen -> /* MODIFIER le STATE */
                        navController.navigateSingleToTop(newScreen.route)
                    },
                    currentDestination = currentScreen
                )
            }
        ) { innerPadding ->
            // Navigation handling
            AppNavHost(
                navController = navController,
                modifier = Modifier.padding(innerPadding),
                moveToScreen3Action = {
                    navController.navigateSingleToTop(MessagesScreen.route)
                }
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SimpleNavApp()
}