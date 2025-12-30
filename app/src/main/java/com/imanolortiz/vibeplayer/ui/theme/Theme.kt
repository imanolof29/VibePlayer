package com.imanolortiz.vibeplayer.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val VibeDarkColorScheme = darkColorScheme(
    primary = ButtonPrimary,
    primaryContainer = ButtonPrimary30,
    onSurface = TextPrimary,
    onSurfaceVariant = TextSecondary,
    inverseOnSurface = TextDisabled,
    secondary = Accent,
    onSecondary = SurfaceBG,
)

@Composable
fun VibePlayerTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        content = content,
        colorScheme = VibeDarkColorScheme
    )
}