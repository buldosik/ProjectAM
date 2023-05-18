package com.example.projectam.utils

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projectam.R

class LobbyAdapter (
    private val context: Context,
    private val players: MutableList <Player>
    ) : RecyclerView.Adapter<LobbyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LobbyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.lobby_cell, parent, false)
        return LobbyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: LobbyViewHolder, position: Int) {
        if (position > players.size - 1) {
            holder.bindView(null)
        } else {
            holder.bindView(players[position])
        }
    }
}