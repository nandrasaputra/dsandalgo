/*
    * Condition:
    * 1. char element can be repeated
    * 2. if the compression output length > original string, then return the original one.
    * 3. all character is from a~z and lowercase
    * */
fun stringCompression(input: String) : String {
    val stringCompressionResult = StringBuilder()
    val inputLowerCase = input.toLowerCase()

    var currentChar = 'a'
    var count = 0

    for(index in inputLowerCase.indices) {
        if (inputLowerCase[index] != currentChar) {
            stringCompressionResult.append(compressChar(currentChar, count))
            currentChar = inputLowerCase[index]
            count = 1
        } else {
            count++
        }
    }
    stringCompressionResult.append(compressChar(currentChar, count))
    val result = stringCompressionResult.toString()
    return if (input.length >= result.length) result else input
}

private fun compressChar(char: Char, count: Int) : String {
    return when (count) {
        0 -> {
            ""
        }
        1 -> {
            char.toString()
        }
        else -> { "$char$count"}
    }
}