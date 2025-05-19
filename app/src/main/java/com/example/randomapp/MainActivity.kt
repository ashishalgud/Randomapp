package com.example.randomapp  // Make sure this matches your package name

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.util.Random
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    private lateinit var mainLayout: LinearLayout
    private lateinit var changeColorButton: Button
    private val random = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize variables
        mainLayout = findViewById(R.id.mainLayout)
        changeColorButton = findViewById(R.id.changeColorButton)

        // Set click listener for the button
        changeColorButton.setOnClickListener {
            changeBackgroundColor()
        }
    }

    /**
     * Changes the background color of the layout to a random color
     */
    private fun changeBackgroundColor() {
        // Generate random colors for RGB components
        val red = random.nextInt(256)
        val green = random.nextInt(256)
        val blue = random.nextInt(256)

        // Create the color and set it as background
        val randomColor = Color.rgb(red, green, blue)
        mainLayout.setBackgroundColor(randomColor)
    }
}