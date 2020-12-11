package com.sumittrehan.firstkotlinapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity(): AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val bundle: Bundle? = intent.extras
        val userMsg:String = bundle?.getString("user_message") ?: "NA"
        val txtView2:TextView = findViewById<TextView>(R.id.textView2)
        txtView2.text = userMsg
    }
}