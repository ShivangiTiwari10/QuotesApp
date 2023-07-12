package com.example.quotesapp

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.quotesapp.models.Quotes
import com.google.gson.Gson

// To get Data from json (data management)
object DataManeger {

    var data = emptyArray<Quotes>()

    var curreQuote: Quotes? = null

    //    Define a state
    var currentPage = mutableStateOf(pages.LISTING)
    var isDataLoaded = mutableStateOf(false)

    fun loadAssetsFromFile(context: Context) {
        val inputStream = context.assets.open("quotes.json")
        val size: Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()

        val jason = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(jason, Array<Quotes>::class.java)
        isDataLoaded.value = true
    }


    fun switchPages(quotes: Quotes?) {

        if (currentPage.value == pages.LISTING) {
            curreQuote = quotes
            currentPage.value = pages.DETAIL
        } else {
            currentPage.value = pages.LISTING
        }
    }
}