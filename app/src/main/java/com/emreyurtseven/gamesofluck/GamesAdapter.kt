package com.emreyurtseven.gamesofluck

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.emreyurtseven.gamesofluck.DiceRoller.DiceRoller
import com.emreyurtseven.gamesofluck.HeadsOrTails.HeadsOrTails
import com.emreyurtseven.gamesofluck.TruthOrDare.TruthOrDare
import com.emreyurtseven.gamesofluck.databinding.MainRowBinding

class GamesAdapter(val gameList: ArrayList<GamesModel>) : RecyclerView.Adapter<GamesAdapter.GamesHolder>() {

    class GamesHolder(val binding: MainRowBinding) : RecyclerView.ViewHolder(binding.root){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GamesHolder {
        val binding = MainRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GamesHolder(binding)
    }

    override fun onBindViewHolder(holder: GamesHolder, position: Int) {
        holder.binding.gamesItemTitle.text = gameList.get(position).gameName
        holder.binding.gamesItemImage.setImageResource(gameList.get(position).gameImage)

        holder.itemView.setOnClickListener {
            if(gameList.get(position).gameID == 4) {
                val intent = Intent(holder.itemView.context, DiceRoller::class.java)
                holder.itemView.context.startActivity(intent)
            }
            if(gameList.get(position).gameID == 3) {
                val intent = Intent(holder.itemView.context, HeadsOrTails::class.java)
                holder.itemView.context.startActivity(intent)
            }
            if(gameList.get(position).gameID == 5) {
                val intent = Intent(holder.itemView.context, TruthOrDare::class.java)
                holder.itemView.context.startActivity(intent)
            }
        }

    }

    override fun getItemCount(): Int {
        return gameList.size
    }
}