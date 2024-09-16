package mrpo.practics.acquaintance

import mrpo.practics.validators.impls.NameValidator

class GetAcquaintance {
    private val nameValidator = NameValidator()

    private var tempName: String? = null

    var name: String = ""

    fun askName() {
        println("Welcome to the Brain Games! May I have your name?")
        tempName = readln()
        while (nameValidator.validate(tempName).not()) {
            if (nameValidator.validate(tempName).not()) println("Chosen name is invalid, type new name")
            tempName = readln()
        }
        name = tempName ?: ""
        greetings(tempName ?: "")
    }

    private fun greetings(name: String) {
        println("Hello, $name!")
    }
}
