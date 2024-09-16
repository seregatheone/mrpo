package mrpo.practics.validators

import mrpo.practics.validators.restrictions.LengthRestrictions

interface TextValidator {
    val length: LengthRestrictions
    val restrictionChars : List<Char>
    fun validate(text: String?) : Boolean
}