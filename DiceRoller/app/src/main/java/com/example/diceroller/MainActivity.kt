package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    var diceNum: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val countButton: Button = findViewById(R.id.count_up)
        countButton.setOnClickListener { countUp() }
        val resetButton: Button = findViewById(R.id.reset_text)
        resetButton.setOnClickListener { reset() }
    }
    private fun rollDice() {
//      Toast.makeText(this, "button clicked",
//            Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        diceImage.setImageResource(drawableResource)
        diceNum = randomInt
    }

    private fun countUp() {
        if (diceNum < 6) {
            diceNum += 1
        }
        val drawableResource = when (diceNum) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        diceImage.setImageResource(drawableResource)
    }

    private fun reset() {
        diceImage.setImageResource(R.drawable.empty_dice)
        diceNum = 0
    }
}