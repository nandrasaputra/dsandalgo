package problems.hackerrank

import java.lang.StringBuilder

/*
*   HackerRank: Caesar Cipher
*   https://www.hackerrank.com/challenges/caesar-cipher-1/problem
*/

fun caesarCipher(s: String, k: Int): String {
    val resultStringBuilder = StringBuilder()
    s.forEach {
        when {
            it.isUpperCase() -> {
                val base = 'A'.toInt()
                val cipheredChar = (base + ((it.toInt() + k - base) % 26)).toChar()
                resultStringBuilder.append(cipheredChar)
            }
            it.isLowerCase() -> {
                val base = 'a'.toInt()
                val cipheredChar = (base + ((it.toInt() + k - base) % 26)).toChar()
                resultStringBuilder.append(cipheredChar)
            }
            else -> {
                resultStringBuilder.append(it)
            }
        }
    }
    return resultStringBuilder.toString()
}