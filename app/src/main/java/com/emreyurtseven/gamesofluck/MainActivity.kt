package com.emreyurtseven.gamesofluck

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.emreyurtseven.gamesofluck.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var gamesList: ArrayList<GamesModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        gamesList = ArrayList<GamesModel>()

        val spin = GamesModel(0,getString(R.string.wheels_of_fortune),R.drawable.img_spin)
        gamesList.add(spin)

        val randomNumber = GamesModel(1,getString(R.string.random_number),R.drawable.img_number_seven)
        gamesList.add(randomNumber)

        val slotMachine = GamesModel(2,getString(R.string.slot_machine),R.drawable.img_slot_machine)
        gamesList.add(slotMachine)

        val coin = GamesModel(3,getString(R.string.head_or_tails),R.drawable.img_coin)
        gamesList.add(coin)

        val dice = GamesModel(4,getString(R.string.dice_roller),R.drawable.img_dice)
        gamesList.add(dice)

        val bottle = GamesModel(5,getString(R.string.truth_or_dare),R.drawable.img_bottle)
        gamesList.add(bottle)

        binding.mainRecyclerView.layoutManager = LinearLayoutManager(this)
        val gamesAdapter = GamesAdapter(gamesList)
        binding.mainRecyclerView.adapter = gamesAdapter

    }
}