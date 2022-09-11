package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import java.util.*
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var myButton: Button = findViewById(R.id.roll_button)
        myButton.text="Let's Roll"
        myButton.setOnClickListener{
           //Toast.makeText(this,"We are rolling", LENGTH_SHORT)
            rollDice()
        }

    }

    private fun rollDice() {
        var myText :TextView = findViewById(R.id.result_text)

        val randomInt = Random().nextInt()+1
        myText.text=randomInt.toString()
    }
}