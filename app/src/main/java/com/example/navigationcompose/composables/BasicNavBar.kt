package com.example.navigationcompose.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.navigationcompose.destinations.BasicAppDestination
import com.example.navigationcompose.destinations.ScreenOne
import com.example.navigationcompose.destinations.navTabs

private var TabHeight = 56.dp

@Composable
fun BasicNavBar(
    destinations: List<BasicAppDestination>,
    onTabSelected: (BasicAppDestination) -> Unit /* EVENT - Change screen*/,
    currentDestination: BasicAppDestination
) {
    // Row
    // Home        Profile         Settings
    //  *             *               *

    Surface(
        Modifier
            .fillMaxWidth()
    ) {
        Row(horizontalArrangement = Arrangement.SpaceEvenly) {
            destinations.forEach { screen ->
                BasicNavTab(
                    title = screen.name,
                    icon = screen.icon,
                    onSelected = { onTabSelected(screen) },
                    selected = currentDestination == screen
                )
            }
        }
    }
}


@Composable
fun BasicNavTab(
    title: String,
    icon: ImageVector,
    onSelected: () -> Unit,
    selected: Boolean
) {

    val tabTintColor = if(selected) Color.Black else Color.Gray
    // Home
    //  *
    Column(
        modifier = Modifier.padding(16.dp)
            .height(TabHeight)
            .selectable(
                selected = selected,
                onClick = onSelected,
                role = Role.Tab
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(imageVector = icon, contentDescription = "", tint = tabTintColor)

        Spacer(Modifier.height(12.dp))

        Text(title, style = MaterialTheme.typography.bodyMedium)
    }
}






@Preview
@Composable
fun BasicNavTopBarPreview() {

    BasicNavBar(
        destinations = navTabs,
        onTabSelected = { tab -> },
        currentDestination = ScreenOne
    )
}


@Preview
@Composable
fun BasicNavTabPreview() {
    Surface() {
        BasicNavTab(
            title = "Home",
            icon = Icons.Default.Home,
            onSelected = {},
            selected = true
        )
    }
}