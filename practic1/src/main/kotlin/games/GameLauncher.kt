package mrpo.practics.games

import mrpo.practics.utils.readInt
import mrpo.practics.validators.impls.GameTypesValidator

class GameLauncher(
    private val username : String
) {
    private val gameTypeValidator = GameTypesValidator()
    fun requestGame(): Game{
        println("for LCM press ${LCM.GAME_TYPE_VALUE}, for GeometricProgression press ${GeometricProgression.GAME_TYPE_VALUE}")
        var gameType = readInt()
        while (gameTypeValidator.validate(gameType).not()){
            println("Game type not valid, type new game type")
            gameType = readInt()
        }
        return when (gameType) {
            LCM.GAME_TYPE_VALUE -> LCM(username)
            GeometricProgression.GAME_TYPE_VALUE -> GeometricProgression(username)
            else -> throw IllegalArgumentException("Game type not valid")
        }
    }

}
