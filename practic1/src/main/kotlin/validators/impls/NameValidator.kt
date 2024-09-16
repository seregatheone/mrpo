package mrpo.practics.validators.impls

import mrpo.practics.validators.TextValidator
import mrpo.practics.validators.restrictions.LengthRestrictions

class NameValidator() : TextValidator {
    override val length: LengthRestrictions
        get() = LengthRestrictions.NoRestrictions
    override val restrictionChars: List<Char>
        get() = listOf(
            '*',
            '\'',
            '/',
            '\\',
            '{',
            '}',
            '[',
            ']',
            '`',
            '!',
            '@',
            '#',
            '$',
            '%',
            '^',
            '&',
            '*',
            '(',
            ')',
        )

    override fun validate(text: String?): Boolean {
        if (text == null) return false
        if (restrictionChars.any { text.contains(it) }) return false
        return when(length) {
            LengthRestrictions.NoRestrictions -> {
                true
            }
            is LengthRestrictions.MaxLengthRestriction -> {
                text.length <= (length as LengthRestrictions.MaxLengthRestriction).max
            }
            is LengthRestrictions.MinLengthRestriction -> {
                text.length >= (length as LengthRestrictions.MinLengthRestriction).min
            }
            is LengthRestrictions.BoundLengthRestriction -> {
                val boundLengthRestriction = length as LengthRestrictions.BoundLengthRestriction
                text.length in boundLengthRestriction.min..boundLengthRestriction.max
            }
        }
    }
}