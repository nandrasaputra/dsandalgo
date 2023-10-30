package problems.hackerrank

/*
*   HackerRank: Encryption
*   https://www.hackerrank.com/challenges/encryption/problem
*/

fun encryption(s: String): String {
    val stringWithoutSpace = s.replace("\\s".toRegex(), "")
    var row = Math.floor(Math.sqrt(stringWithoutSpace.length.toDouble())).toInt()
    var column = Math.ceil(Math.sqrt(stringWithoutSpace.length.toDouble())).toInt()

    if (row*column < stringWithoutSpace.length) {
        val max = Math.max(row, column)
        row = max
        column = max
    }

    val result = StringBuilder()

    for (c in 0 until column) {
        var charIndex = c
        for (r in 0 until row) {
            try {
                val char = stringWithoutSpace[charIndex]
                result.append(char)
            } catch (e: Exception) {}
            charIndex += column
        }
        result.append(" ")
    }

    return result.toString()
}