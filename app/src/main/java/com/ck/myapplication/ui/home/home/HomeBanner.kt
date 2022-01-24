package com.ck.myapplication.ui.home.home

import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.ck.myapplication.R
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.delay
import java.lang.Thread.yield

@ExperimentalPagerApi
@Composable
fun HomeBanner() {
    val pagerState = rememberPagerState()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HorizontalPager(
            modifier = Modifier.height(160.dp),
            count = 10, state = pagerState,
        ) { page ->
            Image(
                painter = rememberImagePainter(
                    data = "https://pic1.zhimg.com/80/v2-3cc968f78b05dca2977e4220bf2939cc_1440w.jpg",
                    builder = {
                        crossfade(true)
                        placeholder(drawableResId = R.drawable.ic_launcher_background)
                    }
                ),
                contentDescription = "",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop,
            )
        }
        Spacer(modifier = Modifier.height(12.dp))
        HorizontalPagerIndicator(
            pagerState = pagerState,
        )
    }

    LaunchedEffect(Unit) {
        while (true) {
            yield()
            delay(2000)
            pagerState.animateScrollToPage(
                page = (pagerState.currentPage + 1) % (pagerState.pageCount),
            )
        }
    }


}