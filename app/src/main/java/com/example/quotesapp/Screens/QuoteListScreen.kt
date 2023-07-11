package com.example.quotesapp.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.quotesapp.models.Quotes


@Composable
fun QuoteListScreen(data: Array<Quotes>, onClick: () -> Unit) {

    Column() {

        Text(
            text = "Quotes App", textAlign = TextAlign.Center,
            modifier = androidx.compose.ui.Modifier
                .padding(8.dp, 24.dp)
                .fillMaxWidth(1f), style = MaterialTheme.typography.h5,
            fontFamily = FontFamily.SansSerif
        )
        QuoteList(data = data) {
            onClick
        }

    }

}