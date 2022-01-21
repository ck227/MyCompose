package com.ck.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.ck.myapplication.ui.MyComposeApp
import com.ck.myapplication.ui.theme.MyComposeTheme
import com.google.accompanist.insets.ProvideWindowInsets

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //true内容不填充状态栏，false填充
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            //监听界面状态信息？通知栏，导航栏，软键盘？
            ProvideWindowInsets {
                MyComposeTheme() {
                    MyComposeApp()
                }
            }
        }
    }
}




