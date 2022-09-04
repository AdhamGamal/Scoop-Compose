package com.amg.scoop.ui.theme

import android.content.res.Configuration
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun ProvideDimens(
    dimensions: Dimensions,
    content: @Composable () -> Unit
) {
    val dimensionSet = remember { dimensions }
    CompositionLocalProvider(LocalAppDimens provides dimensionSet, content = content)
}

private val LocalAppDimens = staticCompositionLocalOf { defaultDimens }

@Composable
fun ScoopTheme(
    configuration: Configuration = LocalConfiguration.current,
    content: @Composable () -> Unit
) {

    val dimensions = when {
        configuration.screenWidthDp < 360 -> {
            sw320dp
        }
        configuration.screenWidthDp < 400 -> {
            sw360dp
        }
        else -> {
            defaultDimens
        }
    }

    ProvideDimens(dimensions = dimensions) {
        MaterialTheme(
            colors = darkColors(
                primary = Color(0xFF1F1F1F),
                primaryVariant = Color.Black,
//                secondary = Color.White,
//                secondaryVariant = Color.Black
            ),
            typography = getAppTypography(),
            shapes = getAppShapes(),
            content = content
        )
    }
}

object AppTheme {
    val dimens: Dimensions
        @Composable
        get() = LocalAppDimens.current
}