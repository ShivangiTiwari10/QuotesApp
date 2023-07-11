package com.example.quotesapp.Screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.quotesapp.models.Quotes

@Composable
fun QuoteList(data: Array<Quotes>, onClick: () -> Unit) {


    LazyColumn(content = {
        items(data) {
            QuoteListItems(quotes = it) {
                onClick()
            }
        }
    })
}