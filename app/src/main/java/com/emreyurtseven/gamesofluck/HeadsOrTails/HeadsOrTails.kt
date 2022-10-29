package com.emreyurtseven.gamesofluck.HeadsOrTails

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.emreyurtseven.gamesofluck.R
import com.emreyurtseven.gamesofluck.databinding.ActivityHeadsOrTailsBinding
import com.google.android.material.snackbar.Snackbar

class HeadsOrTails : AppCompatActivity() {
    private lateinit var binding: ActivityHeadsOrTailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHeadsOrTailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.coinImage.setOnClickListener {
            val snack = Snackbar.make(it,R.string.flip_a_coin,Snackbar.LENGTH_SHORT)
            snack.show()
            flipCoin()
        }
    }

    private fun flipCoin() {
        val coin = Coin()
        val coinFlip = coin.flip()

        binding.coinImage.animate().apply {
            duration = 1000
            rotationXBy(1800f)
            binding.coinImage.isClickable = false
        }.withEndAction{
            when (coinFlip) {
                1 -> {
                    binding.coinImage.setImageResource(R.drawable.img_coin)
                    binding.headsOrTailsResultText.text = getString(R.string.tails)
                }
                2 -> {
                    binding.coinImage.setImageResource(R.drawable.img_coin_heads)
                    binding.headsOrTailsResultText.text = getString(R.string.heads)
                }
            }
            binding.coinImage.isClickable = true
        }.start()


    }
}