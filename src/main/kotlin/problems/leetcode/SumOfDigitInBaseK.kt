package problems.leetcode

/*
*   1837. Sum of Digits in Base K
*   https://leetcode.com/problems/sum-of-digits-in-base-k/
*/

import java.lang.StringBuilder

object SumOfDigitInBaseK {
    fun sumBase(n: Int, k: Int): Int {
        val numberInBaseKString = convertToBaseKInString(n, k)
        var result = 0
        numberInBaseKString.forEach {
            result += it.toString().toInt()
        }
        return result
    }

    private fun convertToBaseKInString(numberInBase10: Int, baseTarget: Int) : String {

        var numberLeft = numberInBase10
        val result = StringBuilder()

        for (power in 10 downTo 0) {
            val positionPower = Math.pow(baseTarget.toDouble(), power.toDouble()).toInt()
            val positionValue = numberLeft / positionPower
            numberLeft -= (positionValue * positionPower)
            result.append(positionValue)
        }

        return result.toString()
    }
}