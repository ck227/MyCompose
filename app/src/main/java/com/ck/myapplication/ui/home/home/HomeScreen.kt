package com.ck.myapplication.ui.home.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ck.myapplication.ui.theme.MyComposeTheme
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Surface(modifier = modifier.fillMaxSize(), color = MyComposeTheme.colors.baseBackgroundColor) {
        Column {
            HomeTitleBar()
            HomeBanner()
            HomeIcons()
        }
    }

}