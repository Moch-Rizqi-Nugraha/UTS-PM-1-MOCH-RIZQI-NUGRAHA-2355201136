package com.example.LoyalCrew

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        val itemList = listOf(
            ItemList("Compass", "Tribune Maroon", R.drawable.maroon),
            ItemList("Onitsuka Tiger", "Mexico 66 SD", R.drawable.mexico),
            ItemList("Adidas", "Bali Island", R.drawable.bali),
            ItemList("NB", "509 unisex", R.drawable.unisex),
            ItemList("Nike", "Air Jordan", R.drawable.jordan),
        )

        val adapter = AdapterList(itemList)
        recyclerView.adapter = adapter
    }
}
