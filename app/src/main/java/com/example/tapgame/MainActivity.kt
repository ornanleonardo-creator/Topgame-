package com.example.tapgame

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scoreText = findViewById<TextView>(R.id.scoreText)
        val tapButton = findViewById<Button>(R.id.tapButton)

        tapButton.setOnClickListener {
            score++
            scoreText.text = "Score : $score"
        }
    }
}
