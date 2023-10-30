package problems.leetcode

/*
*   Leetcode: 1684. Count the Number of Consistent Strings
*   https://leetcode.com/problems/count-the-number-of-consistent-strings
*/

object CountConsistentString {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        var result = 0
        words.forEach { string ->
            var isValid = true
            for (char in string) {
                if (!allowed.contains(char)) {
                    isValid = false
                    break
                }
            }
            if (isValid) {
                result++
            }
        }
        return result
    }
}