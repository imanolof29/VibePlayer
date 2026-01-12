package com.imanolortiz.vibeplayer

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.imanolortiz.vibeplayer.presentation.main.MainScreenRoot
import com.imanolortiz.vibeplayer.presentation.permission.PermissionScreenRoot

@Composable
fun VibePlayerNavigation() {

    val backStack = rememberNavBackStack(PermissionScreenRoute)

    NavDisplay(
        entryProvider = entryProvider {
            entry<PermissionScreenRoute> {
                PermissionScreenRoot(
                    navigateToMain = {

                    }
                )
            }
            entry<MainScreenRoute> {
                MainScreenRoot()
            }
        },
        backStack = backStack
    )
}
