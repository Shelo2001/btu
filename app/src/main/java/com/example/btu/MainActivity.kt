package com.example.btu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.btu.Product
import com.example.btu.R.*
import com.example.myapplication.ProductsAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        recyclerView = findViewById(id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val products = listOf(
            Product("asd", 20.99, drawable.ic_launcher_foreground),
            Product("asd", 20.99, drawable.ic_launcher_foreground),
            Product("asd", 20.99, drawable.ic_launcher_foreground),
        )

        adapter = ProductsAdapter(products)
        recyclerView.adapter = adapter
    }
}