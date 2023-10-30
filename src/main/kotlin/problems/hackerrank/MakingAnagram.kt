package problems.hackerrank

import java.util.*
import kotlin.math.abs

/*
*   HackerRank Problem : Strings: Making Anagrams
*   https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
* */

fun makeAnagram(a: String, b: String): Int {
    // because the string input is a ASCII character from a~z, we could use array to store each char value.
    // to get the array index of each char, we could subtract it with char the int value of 'a'
    val baseChar = 'a'.toInt()
    val charCountArrayA = IntArray(26) {0}
    val charCountArrayB = IntArray(26) {0}
    a.forEach {
        val arrayIndex = it.toInt() - baseChar
        charCountArrayA[arrayIndex]++
    }

    b.forEach {
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