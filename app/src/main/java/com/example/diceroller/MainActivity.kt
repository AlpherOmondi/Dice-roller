package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import java.util.*
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    lateinit var myImage:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        var myButton: Button = findViewById(R.id.roll_button)
        myButton.text="Let's Roll"
        myButton.setOnClickListener{
           //Toast.makeText(this,"We are rolling", LENGTH_SHORT)
            rollDice()
        }
        var myImage:ImageView = findViewById(R.id.drawable_resource)
    }

    private fun rollDice() {


        val randomInt = Random().nextInt()+1

        val diceImage = when{
            randomInt > 1000000 -> R.drawable.dice_1
            randomInt < 0 -> R.drawable.dice_2
            randomInt > 100000000-> R.drawable.dice_3
            randomInt > 1000000 -> R.drawable.dice_4
            randomInt > 10000 -> R.drawable.dice_5

            else -> {R.drawable.dice_6}
        }


         myImage.setImageResource(diceImage)
    }
}