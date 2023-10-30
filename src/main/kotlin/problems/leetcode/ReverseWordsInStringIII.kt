package problems.leetcode

/*
*   leetcode: 557. Reverse Words in a String III
*   https://leetcode.com/problems/reverse-words-in-a-string-iii/
*/

object ReverseWordsInStringIII {
    fun reverseWords(s: String): String {
        val result = StringBuilder()
        s.split(" ").forEach {
            for (index in it.length -1 downTo 0) {
                result.append(it[index])
            }
            result.append(" ")
        }
        result.deleteCharAt(result.length - 1)
        return result.toString()
    }
}