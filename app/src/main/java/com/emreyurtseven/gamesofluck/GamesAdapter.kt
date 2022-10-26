package com.emreyurtseven.gamesofluck

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
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

        }

    }

    override fun getItemCount(): Int {
        return gameList.size
    }
}