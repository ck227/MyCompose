package com.ck.myapplication.ui.home.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ck.myapplication.R

@Composable
fun HomeIcons() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
    ) {
        Image(
            modifier = Modifier.width(56.dp),
            painter = painterResource(id = R.mipmap.home_icon1), contentDescription = ""
        )
        Image(
            modifier = Modifier.width(56.dp),
            painter = painterResource(id = R.mipmap.home_icon2), contentDescription = ""
        )
        Image(
            modifier = Modifier.width(56.dp),
            painter = painterResource(id = R.mipmap.home_icon3), contentDescription = ""
        )
        Image(
            modifier = Modifier.width(56.dp),
            painter = painterResource(id = R.mipmap.home_icon4), contentDescription = ""
        )
    }
}