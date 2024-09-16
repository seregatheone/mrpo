package mrpo.practics

import mrpo.practics.acquaintance.GetAcquaintance
import mrpo.practics.games.GameLauncher
import mrpo.practics.games.GeometricProgression
import mrpo.practics.games.LCM

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val getAcquaintance = GetAcquaintance()
    val gameLauncher = GameLauncher(getAcquaintance.name)

    getAcquaintance.askName()

    val game = gameLauncher.requestGame()

    for (i in 0..2){
        game.playGame()
    }

}