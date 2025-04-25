package com.example.statecompose.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.statecompose.model.Quote

@Composable
fun QuoteListScreen(data: List<Quote>,onClick:(quote: Quote)-> Unit){
    Column(){
        Text(
            text="My Quotes App",
            modifier = Modifier
                .padding(top = 30.dp)
                .padding(8.dp,24.dp)
                .fillMaxWidth(1f),
            style = MaterialTheme.typography.headlineMedium
        )
        QuoteList(data = data, onClick = onClick)


    }
}