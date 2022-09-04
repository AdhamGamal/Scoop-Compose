package com.amg.scoop.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.amg.scoop.R
import com.amg.scoop.models.ListingSection
import com.amg.scoop.models.MostPopular

sealed class Screen(val route: String, val icon: ImageVector, @StringRes val resourceId: Int) {
    object Home : Screen(route = "home", icon = Icons.Filled.Home, resourceId = R.string.home)
    object Popular : Screen(route = "popular", icon = Icons.Default.ThumbUp, resourceId = R.string.popular)
    object IMDB : Screen(route = "imdb", icon = Icons.Default.List, resourceId = R.string.imdb)
    object TMDB : Screen(route = "tmdb", icon = Icons.Default.ThumbUp, resourceId = R.string.tmdb)
}

@Composable
fun MainScreen() {

    val items = listOf(
        Screen.Home,
        Screen.Popular,
        Screen.IMDB,
        Screen.TMDB,
    )

    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            BottomNavigation {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination
                items.forEach { screen ->
                    BottomNavigationItem(
                        icon = { Icon(screen.icon, contentDescription = null) },
                        label = { Text(stringResource(screen.resourceId)) },
                        selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                        onClick = {
                            navController.navigate(screen.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }
        },
        content = { innerPadding ->
            NavHost(
                navController,
                startDestination = Screen.Home.route,
                Modifier.padding(innerPadding)
            ) {
                composable(Screen.Home.route) {
                    LandingScreen(
                        "Scoop",
                        listOf<ListingSection>(
                            MostPopular.default,
                            MostPopular.default,
                            MostPopular.default,
                            MostPopular.default,
                            MostPopular.default,
                        )
                    )
                }
                composable(Screen.Popular.route) {
                    ListingScreen(
                        MostPopular.default
                    )
                }
                composable(Screen.IMDB.route) {
                    ListingScreen(
                        MostPopular.default
                    )
                }
                composable(Screen.TMDB.route) {
                    ListingScreen(
                        MostPopular.default
                    )
                }
            }
        }
    )
}
