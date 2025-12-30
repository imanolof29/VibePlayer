package com.imanolortiz.vibeplayer.ui.components.topbar

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.imanolortiz.vibeplayer.ui.theme.VibePlayerTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VibePlayerMainTopBar(
    modifier: Modifier = Modifier
) {

    val colors = TopAppBarDefaults.topAppBarColors(
        containerColor = MaterialTheme.colorScheme.onSecondary
    )

    TopAppBar(
        title = {
            Text("VibePlayer")
        },
        colors = colors,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun VibePlayerMainTopBar_Preview(modifier: Modifier = Modifier) {
    VibePlayerTheme {
        VibePlayerMainTopBar()
    }
}