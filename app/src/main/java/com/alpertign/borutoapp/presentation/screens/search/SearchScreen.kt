package com.alpertign.borutoapp.presentation.screens.search

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

/**
 * Created by Alperen Acikgoz on 09,January,2023
 */

@Composable
fun SearchScreen(
    navController: NavHostController
) {

    Scaffold(
        topBar = { SearchTopBar(
            text = "",
            onTextChange = {},
            onSearchClicked = {},
            onCloseClicked = {}
        ) }
    ) {

    }

}