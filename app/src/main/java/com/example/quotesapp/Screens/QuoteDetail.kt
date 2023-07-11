package com.example.quotesapp.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun QuoteDetail() {
    Box(
//        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background
                (
                Brush.linearGradient(
                    colors = listOf
                        (
                        Color(0xFF89BD65),
                        Color(0xFFD0D1CF)

                    )

                )
            )
    ) {
        Card(
            elevation = 4.dp,
            modifier = Modifier.padding(32.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(16.dp, 14.dp)
                    .align(Alignment.Center)
            ) {
                Image(
                    imageVector = Icons.Filled.FormatQuote,
                    contentDescription = "Quote"
                )
                Text(
                    text = "Time is Money",
                    fontFamily = FontFamily.SansSerif, style = MaterialTheme.typography.h6
                )
                Spacer(
                    modifier =
                    Modifier.heightIn(16.dp)
                )
                Text(
                    text = "TheoArrestor",
                    fontFamily = FontFamily.Monospace,
                    style = MaterialTheme.typography.subtitle1
                )
            }

        }

    }


}