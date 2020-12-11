package com.sumittrehan.firstkotlinapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView:RecyclerView = findViewById(R.id.recycler_view)
        val hobbiesList: List<String> = listOf(
                "Coding",
                "Playing",
                "Music",
                "Travel",
                "Coding",
                "Playing",
                "Music",
                "Travel",
                "Coding",
                "Playing",
                "Music",
                "Travel",
                "Coding",
                "Playing",
                "Music",
                "Travel",
                "Coding",
                "Playing",
                "Music",
                "Travel",
                "Coding",
                "Playing",
                "Music",
                "Travel",
                "Coding",
                "Playing",
                "Music",
                "Travel",
                "Coding",
                "Playing",
                "Music",
                "Travel",
                "Coding",
                "Playing",
                "Music",
                "Travel")
        val hobbiesAdapter:HobbiesAdapter = HobbiesAdapter(this, hobbiesList)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerView.adapter = hobbiesAdapter
    }

}