package com.example.quotesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.quotesapp.Screens.QuoteListScreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//   set Data in IO thread
        CoroutineScope(Dispatchers.IO).launch {
            delay(1000)
            DataManeger.loadAssetsFromFile(applicationContext)

        }
        setContent {
            App()
        }
    }
}


@Composable
fun App() {

//    exising data in main thread

    if (DataManeger.isDataLoaded.value) {
        QuoteListScreen(data = DataManeger.data) {

        }
    } else {

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.size(100.dp)
                .background(Color.LightGray)

        ) {
            Text(text = "Loading")

        }
    }

}

