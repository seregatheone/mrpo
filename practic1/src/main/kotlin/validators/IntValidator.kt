package mrpo.practics.validators

interface IntValidator {
    val availableValues : List<Int>
    fun validate(i: Int?): Boolean
}