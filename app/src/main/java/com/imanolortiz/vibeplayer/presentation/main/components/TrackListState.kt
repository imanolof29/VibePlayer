package com.imanolortiz.vibeplayer.presentation.main.components

import androidx.compose.runtime.Composable

@Composable
fun TrackListState(
    tracks: List<String>
) {
    if (tracks.isEmpty()) {
        MainScreenEmptyState()
    } else {
        TrackList()
    }
}