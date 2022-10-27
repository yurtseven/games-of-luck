package com.emreyurtseven.gamesofluck

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.emreyurtseven.gamesofluck.databinding.ActivityDiceRollerBinding

class DiceRoller : AppCompatActivity() {

    private lateinit var binding: ActivityDiceRollerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDiceRollerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.rollButton.setOnClickListener {
            val toast = Toast.makeText(this, R.string.dice_rolled, Toast.LENGTH_SHORT)
            toast.show()

            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        binding.rollResultText.text = diceRoll.toString()
    }
}