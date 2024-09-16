package mrpo.practics.games

sealed class Game(
    val gameType : Int,
    val roundAmount : Int
){
    abstract fun playGame()
}