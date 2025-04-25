package com.example.adapterdemo1

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var listView:ListView
    private val fruitNames= arrayOf("Apple","Banana","Grapes","Mango","Orange","Watermelon")

    private val fruitImageIds = arrayOf(R.drawable.apple,R.drawable.banana,R.drawable.grapes,
                                        R.drawable.mango,R.drawable.oranges,R.drawable.watermelon)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.ListView)
        val list = ArrayList<HashMap<String,Any>>()

        for (i in fruitNames.indices){
            val map = HashMap<String,Any>()

            map["fruitName"]=fruitNames[i]
            map["fruitImage"]=fruitImageIds[i]

            list.add(map)
        }
        val from = arrayOf("fruitName","fruitImage")
        val to = intArrayOf(R.id.txt01,R.id.img01)
        val simpleAdapter = SimpleAdapter(this,list,R.layout.list_row_items,from,to)

        listView.adapter = simpleAdapter
    }
}