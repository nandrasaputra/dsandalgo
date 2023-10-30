package problems.leetcode

import java.lang.StringBuilder

/*
    LeetCode Problem : Reformat Phone Number
    https://leetcode.com/problems/reformat-phone-number/

    Example :
    Input: number = "1-23-45 6"
    Output: "123-456"
    Explanation: The digits are "123456".
    Step 1: There are more than 4 digits, so group the next 3 digits. The 1st block is "123".
    Step 2: There are 3 digits remaining, so put them in a single block of length 3. The 2nd block is "456".
    Joining the blocks gives "123-456".
* */

object ReformatPhoneNumber {
    class Solution {
        fun reformatNumber(number: String): String {
            val pattern = Regex("[0-9]")
            val numberStringBuilder = StringBuilder()
            number.forEach {
                val num = it.toString()
                if (pattern.matches(num)) {
                    numberStringBuilder.append(num)
                }
            }

            return getFormattedNumber(numberStringBuilder.toString())
        }

        private fun getFormattedNumber(number: String) : String {
            val result = StringBuilder()
            val remainder = StringBuilder().append(number)
            while (remainder.isNotEmpty()) {
                if (remainder.length >= 4) {
                    if (remainder.length == 4) {
                        val firstPart = remainder.subSequence(0..1)
                        val secondPart = remainder.subSequence(2..3)
                        result.append("-$firstPart-$secondPart")
                        remainder.clear()
                    } else {
                        val numberPart = remainder.subSequence(0..2)
                        result.append("-$numberPart")
                        remainder.delete(0, 3)
                    }
                } else {
                    result.append("-$remainder")
                    remainder.clear()
                }
            }

            if (result.length > 1) {
                result.delete(0,1)
            }

            return result.toString()
        }
    }
}

fun main() {
    print(ReformatPhoneNumber.Solution().reformatNumber("1234"))
}