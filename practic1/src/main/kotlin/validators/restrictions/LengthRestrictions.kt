package mrpo.practics.validators.restrictions

sealed class LengthRestrictions {
    data object NoRestrictions : LengthRestrictions()
    class MinLengthRestriction(val min: Int) : LengthRestrictions()
    class MaxLengthRestriction(val max: Int) : LengthRestrictions()
    class BoundLengthRestriction(val min: Int, val max: Int) : LengthRestrictions()
}