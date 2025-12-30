package com.imanolortiz.vibeplayer.ui.components.button

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.imanolortiz.vibeplayer.ui.theme.VibePlayerTheme

@Composable
fun VibePlayerFloatingActionButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    FloatingActionButton(
        modifier = modifier,
        onClick = onClick,
        shape = CircleShape,
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = MaterialTheme.colorScheme.onPrimary,
        content = content
    )
}


@Preview(showBackground = true)
@Composable
fun VibePlayerFloatingActionButton_Preview(modifier: Modifier = Modifier) {
    VibePlayerTheme {
        VibePlayerFloatingActionButton(onClick = {}, content = {})
    }
}