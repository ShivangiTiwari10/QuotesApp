package com.example.quotesapp

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.quotesapp.models.Quotes
import com.google.gson.Gson

// To get Data from json
object DataManeger {

    var data = emptyArray<Quotes>()
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
}