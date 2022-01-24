package com.ck.myapplication.ui.home.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ExpandMore
import androidx.compose.material.icons.outlined.Message
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.ck.myapplication.ui.theme.MyComposeTheme
import com.google.accompanist.insets.statusBarsPadding

@Composable
fun HomeTitleBar(modifier: Modifier = Modifier) {
    Column(modifier = modifier.statusBarsPadding()) {
        TopAppBar(
            backgroundColor = MyComposeTheme.colors.baseBackgroundColor,
            contentColor = MyComposeTheme.colors.textSecondary,
            elevation = 0.dp
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
            ) {
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = "首页",
                    style = MaterialTheme.typography.subtitle1,
                    color = MyComposeTheme.colors.textSecondary,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,

                    )
                Row(
                    modifier = Modifier.align(Alignment.CenterEnd)
                ) {
                    IconButton(
                        onClick = { /* todo */ },
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Search,
                            tint = MyComposeTheme.colors.primary,
                            contentDescription = ""
                        )
                    }
                    IconButton(
                        onClick = { /* todo */ },
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Message,
                            tint = MyComposeTheme.colors.primary,
                            contentDescription = ""
                        )
                    }
                }
            }
        }
        Divider()
    }
}