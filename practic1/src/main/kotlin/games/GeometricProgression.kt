package mrpo.practics.games

import mrpo.practics.utils.readInt
import kotlin.random.Random

class GeometricProgression(
    private val username : String,
) : Game(
    gameType = GAME_TYPE_VALUE,
    roundAmount =3
) {
    override fun playGame() {
        val firstItem = Random.nextInt(1,5)
        val progressionList = MutableList(Random.nextInt(5,10)){ index: Int ->
            firstItem.power(index)
        }
        val replacementPlace = Random.nextInt(0,progressionList.size)
        val replacementItem = progressionList[replacementPlace]

        val progressionListResult = progressionList.toMutableList<Any>()
        progressionListResult[replacementPlace] = ".."

        println("What number is missing in the progression?")
        println("Question: ${progressionListResult.joinToString(separator = " ")}")

        println("Your answer:")
        val answer = readInt()
        if (answer == replacementItem) {
            println("Correct!")
        }else{
            println("'$answer' is wrong answer. Correct answer was: $replacementItem .Let's try again, $username!")
        }



    }

    companion object{
        const val GAME_TYPE_VALUE = 2
    }
}

fun Int.power(exponentVal: Int): Int {
    var exponent = exponentVal
    var result: Long = 1

    while (exponent != 0) {
        result *= this.toLong()
        --exponent
    }
    return result.toInt()
}