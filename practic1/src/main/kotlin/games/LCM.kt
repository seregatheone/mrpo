package mrpo.practics.games

import mrpo.practics.utils.readInt
import kotlin.random.Random

class LCM(
    private val username : String,
) : Game(
    gameType = GAME_TYPE_VALUE,
    roundAmount = 3
) {
    override fun playGame() {
        println("Find the smallest common multiple of given numbers.")
        val (a,b,c) = List(3){Random.nextInt(1,20)}
        val correctAnswer = lcm(a,b,c)
        println("given numbers: $a, $b, $c")
        println("Your answer:")
        val answer = readInt()
        if (answer == correctAnswer) {
            println("Correct!")
        }else{
            println("'$answer' is wrong answer. Correct answer was $correctAnswer. Let's try again, $username!")
        }
    }

    companion object{
        const val GAME_TYPE_VALUE = 1
    }

}

fun lcm(a: Int, b: Int): Int {
    val larger = if (a > b) a else b
    val maxLcm = a * b
    var lcm = larger
    while (lcm <= maxLcm) {
        if (lcm % a == 0 && lcm % b == 0) {
            return lcm
        }
        lcm += larger
    }
    return maxLcm
}

fun lcm(a: Int, b: Int, c: Int): Int {
    return lcm(a, lcm(b, c))
}