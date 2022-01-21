package com.ck.myapplication.ui.home.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ck.myapplication.ui.theme.MyComposeTheme
import com.google.accompanist.insets.statusBarsPadding

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Surface(modifier = modifier.fillMaxSize(), color = MyComposeTheme.colors.baseBackgroundColor) {
        Column {
            HomeTitleBar()
        }
    }

}