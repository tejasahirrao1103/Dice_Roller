package com.tejraj.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var RollBotton : Button = findViewById(R.id.roll_button)

        RollBotton.setOnClickListener {
            val diceImage : ImageView = findViewById(R.id.Dice_image)
            var randnumber: Int = (1..6).random()

            var ChnageDice = when(randnumber) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
                diceImage.setImageResource(ChnageDice)
        }

    }


    }
