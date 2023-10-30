package problems.hackerrank

/*
*   HackerRank: The Love Letter Mysteries
*   https://www.hackerrank.com/challenges/the-love-letter-mystery/problem
*/

fun theLoveLetterMystery(s: String): Int {
    var leftIndex = 0
    var rightIndex = s.length-1
    var numberOfOperation = 0

    while (leftIndex < rightIndex) {
        val leftChar = s[leftIndex]
        val rightChar = s[rightIndex]
        if (leftChar != rightChar) {
            numberOfOperation += Math.abs(leftChar.toInt() - rightChar.toInt())
        }
        leftIndex++
        rightIndex--
    }

    return numberOfOperation
}