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

        val spin = GamesModel(0,"Wheel of Fortune",R.drawable.img_spin)
        gamesList.add(spin)

        val randomNumber = GamesModel(1,"Random Number",R.drawable.img_number_seven)
        gamesList.add(randomNumber)

        val slotMachine = GamesModel(2,"Slot Machine",R.drawable.img_slot_machine)
        gamesList.add(slotMachine)

        val coin = GamesModel(3,"Heads or Tails",R.drawable.img_coin)
        gamesList.add(coin)

        val dice = GamesModel(4,"Dice Roller",R.drawable.img_dice)
        gamesList.add(dice)

        val bottle = GamesModel(5,"Truth or Dare",R.drawable.img_bottle)
        gamesList.add(bottle)

        binding.mainRecyclerView.layoutManager = LinearLayoutManager(this)
        val gamesAdapter = GamesAdapter(gamesList)
        binding.mainRecyclerView.adapter = gamesAdapter

    }
}