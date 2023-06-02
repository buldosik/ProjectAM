package com.example.projectam

import com.example.projectam.utils.Card
import com.example.projectam.utils.Game

class ClientInfo {
    companion object {
        var username: String = ""
        var id: Int = -1
        var gameCode: String = ""
        var game: Game = Game()
        var chosenCard: Card = Card(-10, false)

        fun init() {
            id = -1
            game = Game()
            chosenCard = Card(-10, false)
        }
    }
}