package com.emreyurtseven.gamesofluck.HeadsOrTails

class Coin {
    fun flip(): Int{
        return (1..2).random()
    }
}