package mrpo.practics.utils

fun readInt() : Int?{
    return try {
        readln().toInt()
    }catch (e: Exception){
        null
    }
}