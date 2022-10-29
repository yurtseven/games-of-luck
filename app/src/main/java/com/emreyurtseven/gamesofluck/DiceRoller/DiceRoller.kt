package com.emreyurtseven.gamesofluck.DiceRoller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.emreyurtseven.gamesofluck.R
import com.emreyurtseven.gamesofluck.databinding.ActivityDiceRollerBinding
import com.google.android.material.snackbar.Snackbar

class DiceRoller : AppCompatActivity() {

    private lateinit var binding: ActivityDiceRollerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDiceRollerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.rollButton.setOnClickListener {
            /*val toast = Toast.makeText(this, R.string.dice_rolled, Toast.LENGTH_SHORT)
            toast.show()*/
            val snack = Snackbar.make(it,R.string.dice_rolled, Snackbar.LENGTH_SHORT)
            snack.show()
            rollDice()
        }
    }

    private fun rollDice(){
        val dice = Dice(6)
        val diceRoll = dice.roll()

        when(diceRoll){
            1 -> binding.diceImage.setImageResource(R.drawable.img_dice_1)
            2 -> binding.diceImage.setImageResource(R.drawable.img_dice_2)
            3 -> binding.diceImage.setImageResource(R.drawable.img_dice_3)
            4 -> binding.diceImage.setImageResource(R.drawable.img_dice_4)
            5 -> binding.diceImage.setImageResource(R.drawable.img_dice_5)
            6 -> binding.diceImage.setImageResource(R.drawable.img_dice_6)
        }

    }
}