package problems.leetcode

/*
*   Leetcode: 1221. Split a String in Balanced Strings
*   https://leetcode.com/problems/split-a-string-in-balanced-strings/
*/

object BalancedStringSplit {
    fun balancedStringSplit(s: String): Int {
        var result = 0
        var startCharIndex = 0
        while (startCharIndex <= s.length-1) {
            val currentChar = s[startCharIndex]
            var currentCharCount = 1
            var notCurrentCharCount = 0
            for (charIndex in startCharIndex+1 until s.length) {
                if (s[charIndex] == currentChar) {
                    currentCharCount++
                } else {
                    notCurrentCharCount++
                    if (currentCharCount == notCurrentCharCount) {
                        break
                    }
                }
            }
            result++
            startCharIndex += (currentCharCount + notCurrentCharCount) // or startCharIndex += (currentCharCount * 2)
        }
        return result
    }
}