package com.example.quotesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.quotesapp.Screens.QuoteListScreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        CoroutineScope(Dispatchers.IO).launch {
            DataManeger.loadAssetsFromFile(applicationContext)

        }
        setContent {
            App()
            }
        }
    }


@Composable
fun App(){

    if (DataManeger.isDataLoaded.value){
        QuoteListScreen(data = DataManeger.data) {
            
        }
    }

}

