package mrpo.practics.validators.impls

import mrpo.practics.validators.IntValidator

class GameTypesValidator : IntValidator {
    override val availableValues: List<Int>
        get() = listOf(1, 2)

    override fun validate(i: Int?): Boolean {
        return i in availableValues
    }

}