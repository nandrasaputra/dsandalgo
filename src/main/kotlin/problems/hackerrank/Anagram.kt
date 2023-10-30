package problems.hackerrank

/*
*   HackerRank: Anagram
*   https://www.hackerrank.com/challenges/anagram/problem
*/

fun anagram(s: String): Int {
    if (s.length % 2 != 0) {
        return -1
    }
    val firstPartString = s.substring(0 until (s.length / 2))
    val secondPartString = s.substring((s.length / 2) until s.length)

    val baseIndex = 'a'.toInt()

    val firstPartCharCountArray = Array(26){0}
    for (char in firstPartString) {
        firstPartCharCountArray[char.toInt() - baseIndex]++
    }

    val secondPartCharCountArray = Array(26) {0}
    for (char in secondPartString) {
        secondPartCharCountArray[char.toInt() - baseIndex]++
    }

    var totalDifference = 0

    for (index in firstPartCharCountArray.indices) {
        totalDifference += Math.abs(firstPartCharCountArray[index] - secondPartCharCountArray[index])
    }

    return totalDifference / 2
}