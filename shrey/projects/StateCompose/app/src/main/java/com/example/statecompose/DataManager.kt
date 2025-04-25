package com.example.statecompose

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.statecompose.model.Quote
import com.google.gson.Gson

object DataManager {
    var data = mutableListOf<Quote>()

    var isDataLoaded = mutableStateOf(false)
    var currentPage = mutableStateOf(Pages.LISTING)
    var currentQuote :Quote? = null

    fun loadAssetsFromFile(context: Context){
        val inputStream = context.assets.open("quotes.json")
        val size : Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json, Array<Quote>::class.java).toMutableList()
        isDataLoaded.value=true
    }

    fun switchPages(quote: Quote?){
        if(currentPage.value == Pages.LISTING){
            currentQuote = quote
            currentPage.value == Pages.DETAIL

        }
        else
            currentPage.value == Pages.LISTING
    }
}