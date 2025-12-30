package com.imanolortiz.vibeplayer.presentation.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.imanolortiz.vibeplayer.presentation.main.components.ScanningIndicator
import com.imanolortiz.vibeplayer.presentation.main.components.TrackListState
import com.imanolortiz.vibeplayer.ui.components.topbar.VibePlayerMainTopBar
import kotlinx.coroutines.delay

@Composable
fun MainScreenRoot() {
    var state by remember { mutableStateOf<ScanningState<List<String>>>(ScanningState.Scanning) }

    LaunchedEffect(Unit) {
        delay(3000L)
        state = ScanningState.Success(listOf("", "", "", ""))
    }

    MainScreen(state = state)
}

@Composable
fun MainScreen(
    state: ScanningState<List<String>>
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            VibePlayerMainTopBar()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.onSecondary)
        ) {
            when (state) {
                is ScanningState.Success<List<String>> -> TrackListState(state.data)
                is ScanningState.Scanning -> ScanningIndicator()
            }
        }
    }
}