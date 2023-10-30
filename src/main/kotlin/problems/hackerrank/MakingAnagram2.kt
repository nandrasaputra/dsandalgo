package problems.hackerrank

/*
*   HackerRank: Making Anagram
*   https://www.hackerrank.com/challenges/making-anagrams/problem
*/

fun makingAnagrams(s1: String, s2: String): Int {
    // because the string input is a ASCII character from a~z, we could use array to store each char value.
    // to get the array index of each char, we could subtract it with char the int value of 'a'
    val baseChar = 'a'.toInt()
    val charCountArrayA = IntArray(26) {0}
    val charCountArrayB = IntArray(26) {0}
    s1.forEach {
        val arrayIndex = it.toInt() - baseChar
        charCountArrayA[arrayIndex]++
    }

    s2.forEach {
        val arrayIndex = it.toInt() - baseChar
        charCountArrayB[arrayIndex]++
    }

    var result = 0

    for (index in charCountArrayA.indices) {
        val difference = Math.abs(charCountArrayA[index] - charCountArrayB[index])
        result += difference
    }

    return result
}