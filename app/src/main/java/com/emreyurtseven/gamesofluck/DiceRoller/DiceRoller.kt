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

            rollDice()
        }
    }

    private fun rollDice(){
        val dice = Dice(6)
        val diceRoll = dice.roll()

        when(diceRoll){
            1 -> {
                binding.diceImage.setImageResource(R.drawable.img_dice_1)
                snackbar(1)
            }
            2 -> {
                binding.diceImage.setImageResource(R.drawable.img_dice_2)
                snackbar(2)
            }
            3 -> {
                binding.diceImage.setImageResource(R.drawable.img_dice_3)
                snackbar(3)
            }
            4 -> {
                binding.diceImage.setImageResource(R.drawable.img_dice_4)
                snackbar(4)
            }
            5 -> {
                binding.diceImage.setImageResource(R.drawable.img_dice_5)
                snackbar(5)
            }
            6 -> {
                binding.diceImage.setImageResource(R.drawable.img_dice_6)
                snackbar(6)
            }
        }

    }

    private fun snackbar(diceResult: Int){
        val snack = Snackbar.make(binding.root,getString(R.string.dice_rolled)+ " " +getString(R.string.result)+ ": " +diceResult.toString(), Snackbar.LENGTH_SHORT)
        snack.show()
    }
}