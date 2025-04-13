package com.portfoliormm.mrshef.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.room.util.query
import com.google.android.material.search.SearchBar
import com.portfoliormm.mrshef.ui.theme.MrShefTheme
import com.portfoliormm.mrshef.ui.theme.SnowBlue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MrShefTheme {
                Color.White
                SearchMain()
            }
        }
    }
}

@Composable
fun SearchMain(
    modifier: Modifier = Modifier
        .padding(8.dp)
        .background(SnowBlue),
    searchText: MutableState<String> = remember {
        mutableStateOf("")
    }
){
    SearchBar(
        query = searchText.value,
        onQueryChange = { text ->
            searchText.value = text
        },
        onSearch = {

        },
        acttive = false,
        onActiveChange = {

        }
    )
}

@Composable
fun mainScreenBox(modifier: Modifier = Modifier) {}