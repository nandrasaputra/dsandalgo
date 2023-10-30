// Check, whether string a and b is anagram

// We assumed that the string input is a alphabet from A~Z (contain no symbols or special characters) and lowercase.
fun isAnagram(stringOne: String, stringTwo: String) : Boolean {
    if (stringOne.length != stringTwo.length) {
        return false
    }

    val charArrayOne = stringOne.toLowerCase().toCharArray()
    val charArrayTwo = stringTwo.toLowerCase().toCharArray()
    val base = 'a'.toInt()

    val charSumArray = IntArray(26)

    charArrayOne.forEach {
        val charArrayOneIndex = it.toInt() - base
        charSumArray[charArrayOneIndex]++
    }

    charArrayTwo.forEach {
        val charArrayTwoIndex = it.toInt() - base
        charSumArray[charArrayTwoIndex]--
    }

    for ((index, value) in charSumArray.withIndex()) {
        if (value != 0) {
            return false
        }
    }

    return true
}
