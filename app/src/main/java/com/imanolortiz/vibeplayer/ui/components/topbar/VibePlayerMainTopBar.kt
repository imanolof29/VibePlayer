package com.imanolortiz.vibeplayer.ui.components.topbar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.imanolortiz.vibeplayer.R
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
            Row {
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "App logo",
                    modifier = modifier
                        .width(24.dp)
                        .height(24.dp)
                )
                Text(
                    "VibePlayer",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.secondary
                )
            }
        },
        colors = colors,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun VibePlayerMainTopBar_Preview() {
    VibePlayerTheme {
        VibePlayerMainTopBar()
    }
}