package com.imanolortiz.vibeplayer.ui.components.button

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.imanolortiz.vibeplayer.ui.theme.VibePlayerTheme

@Composable
fun VibePlayerButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {

    val colors = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = MaterialTheme.colorScheme.onSurface,
    )

    Button(
        modifier = modifier,
        onClick = onClick,
        colors = colors,
        enabled = enabled
    ){
        Text(
            text,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Preview(showBackground = true)
@Composable
fun VibePlayerButton_Preview() {
    VibePlayerTheme {
        VibePlayerButton(
            text = "Button",
            onClick = {}
        )
    }
}