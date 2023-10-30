package problems.leetcode

/*
*   LeetCode: Palindrome Number
*   https://leetcode.com/problems/palindrome-number/
*/

object PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        val stringedNumber = x.toString()
        var startIndex = 0
        var endIndex = stringedNumber.length - 1
        while (startIndex <= endIndex) {
            if (stringedNumber[startIndex] != stringedNumber[endIndex]) {
                return false
            }
            startIndex++
            endIndex--
        }
        return true
    }
}