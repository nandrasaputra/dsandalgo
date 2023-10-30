package problems.hackerrank

/*
*   HackerRank: Funny String
*   https://www.hackerrank.com/challenges/funny-string/problem
*/

fun funnyString(s: String): String {
    val reverseString = s.reversed()
    var firstPointer = 0
    for (secondPointer in 1 until s.length) {
        val stringDiff = Math.abs(s[firstPointer].toInt() - s[secondPointer].toInt())
        val reversedStringDiff = Math.abs(reverseString[firstPointer].toInt() - reverseString[secondPointer].toInt())
        if (stringDiff != reversedStringDiff) {
            return "Not Funny"
        }
        firstPointer++
    }
    return "Funny"
}