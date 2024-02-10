package kz.kazmbs.myfirstapplication.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary = T0T1T6,
    onPrimary = T9A8FF,
    secondary = ZZ5DB2,
    onSecondary = T9A8FF,
    background = BlackInDark,
    onBackground = Color.White,
    surfaceTint = DarkGrayInDark,
    tertiary = S1S1S1,
    onTertiary = A5A5A5,
    surface = T9A8FF,
    onSurface = B2DAFF
)

private val LightColorScheme = lightColorScheme(
    primary = Color.Blue,
    onPrimary = Color.White,
    secondary = ADE2FF,
    onSecondary = O09DFF,
    background = LightGray,
    onBackground = Black,
    surfaceTint = DarkGray,
    tertiary = Color.White,
    onTertiary = E5E5E5,
    surface = O09DFF,
    onSurface = B2DAFF
)

@Composable
fun MyFirstApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        shapes = shapes,
        typography = Typography,
        content = content
    )
}