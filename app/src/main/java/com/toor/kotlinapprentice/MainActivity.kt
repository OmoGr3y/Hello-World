package com.toor.kotlinapprentice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var counter: TextView
    private lateinit var increase: Button
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        increase = findViewById(R.id.button)
        counter = findViewById(R.id.counter)
        increase.setOnClickListener {
            increment()
        }
    }

    private fun increment(){
        val count = count++
        counter.setText(count.toString())

    }
}