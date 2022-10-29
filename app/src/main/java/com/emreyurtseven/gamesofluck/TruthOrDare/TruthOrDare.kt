package com.emreyurtseven.gamesofluck.TruthOrDare

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.emreyurtseven.gamesofluck.R
import com.emreyurtseven.gamesofluck.databinding.ActivityTruthOrDareBinding

class TruthOrDare : AppCompatActivity() {
    private lateinit var binding: ActivityTruthOrDareBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTruthOrDareBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.bottleImage.setOnClickListener {
            turnBottle()
        }
    }

    private fun turnBottle() {
        val bottle = Bottle()
        val turnBottle = bottle.turn()

        binding.bottleImage.animate().apply {
            duration = 3000
            rotationBy(turnBottle.toFloat())
            binding.bottleImage.isClickable = false
        }.withEndAction{
            binding.bottleImage.isClickable = true
        }.start()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.refresh,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_refresh ->{
                finish();
                overridePendingTransition( 0, 0);
                startActivity(getIntent());
                overridePendingTransition( 0, 0);
            }
        }
        return super.onOptionsItemSelected(item)
    }
}