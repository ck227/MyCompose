package com.ck.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.ck.myapplication.ui.MyComposeApp
import com.ck.myapplication.ui.theme.JetsnackTheme
import com.google.accompanist.insets.ProvideWindowInsets

//import com.ck.myapplication.ui.theme.MyComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            ProvideWindowInsets {
                JetsnackTheme() {
                    MyComposeApp()
                }
            }
        }
    }
}




