/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ck.myapplication.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val LightColorPalette = MyComposeColors(
    isDark = false,
    primary = Rose11,
    iconPrimary = White,
    iconInteractive = White,
    iconInteractiveInactive = Light_White,
)

private val DarkColorPalette = MyComposeColors(
    isDark = true,
    primary = Rose11,
    iconPrimary = White,
    iconInteractive = White,
    iconInteractiveInactive = Light_White,
)

@Composable
fun MyComposeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColorPalette else LightColorPalette

    val sysUiController = rememberSystemUiController()
//    SideEffect {
//        sysUiController.setSystemBarsColor(
//            color = colors.uiBackground.copy(alpha = AlphaNearOpaque)
//        )
//    }

    ProvideMyComposeColors(colors) {
        MaterialTheme(
//            colors = debugColors(darkTheme),
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}

object MyComposeTheme {
    val colors: MyComposeColors
        @Composable
        get() = LocalJetsnackColors.current
}

/**
 *  custom Color Palette
 */
@Stable
class MyComposeColors(
    isDark: Boolean,
    primary: Color,
    iconPrimary: Color,
    iconInteractive: Color,
    iconInteractiveInactive: Color,

    ) {
    var isDark by mutableStateOf(isDark)
        private set
    var primary by mutableStateOf(primary)
        private set
    var iconPrimary by mutableStateOf(iconPrimary)
        private set
    var iconInteractive by mutableStateOf(iconInteractive)
        private set
    var iconInteractiveInactive by mutableStateOf(iconInteractiveInactive)
        private set

    fun update(other: MyComposeColors) {
        isDark = other.isDark
        primary = other.primary
        iconPrimary = other.iconPrimary
        iconInteractive = other.iconInteractive
        iconInteractiveInactive = other.iconInteractiveInactive
    }

    fun copy(): MyComposeColors = MyComposeColors(
        isDark = isDark,
        primary = primary,
        iconPrimary = iconPrimary,
        iconInteractive = iconInteractive,
        iconInteractiveInactive = iconInteractiveInactive,
    )
}

@Composable
fun ProvideMyComposeColors(
    colors: MyComposeColors,
    content: @Composable () -> Unit
) {
    val colorPalette = remember {
        // Explicitly creating a new object here so we don't mutate the initial [colors]
        // provided, and overwrite the values set in it.
        colors.copy()
    }
    colorPalette.update(colors)
    CompositionLocalProvider(LocalJetsnackColors provides colorPalette, content = content)
}

private val LocalJetsnackColors = staticCompositionLocalOf<MyComposeColors> {
    error("No JetsnackColorPalette provided")
}
