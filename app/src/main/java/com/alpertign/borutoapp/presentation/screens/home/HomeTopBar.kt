package com.alpertign.borutoapp.presentation.screens.home

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.alpertign.borutoapp.R
import com.alpertign.borutoapp.ui.theme.topAppBarBackGroundColor
import com.alpertign.borutoapp.ui.theme.topAppBarContentColor

/**
 * Created by Alperen Acikgoz on 06,January,2023
 */
@Composable
fun HomeTopBar(onSearchClicked: () -> Unit) {
    TopAppBar(
        title = {
            Text(
                text = "Explore",
                color = MaterialTheme.colors.topAppBarContentColor
            )
        },
        backgroundColor = MaterialTheme.colors.topAppBarBackGroundColor,
        actions = {
            IconButton(onClick = onSearchClicked) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = stringResource(R.string.search_icon)
                )
            }
        }
    )
}

@Composable
@Preview
fun HomeTopAppBarPreview(){
    HomeTopBar {}
}
@Composable
@Preview(uiMode = UI_MODE_NIGHT_YES)
fun HomeTopAppBarDarkPreview(){
    HomeTopBar {}
}