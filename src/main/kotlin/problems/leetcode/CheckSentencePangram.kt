package problems.leetcode

/*
*   Leetcode: 1832. Check if the Sentence Is Pangram
*   https://leetcode.com/problems/check-if-the-sentence-is-pangram/
*/

object CheckSentencePangram {
    fun checkIfPangram(sentence: String): Boolean {
        if(sentence.length < 26) {
            return false
        } else {
            val charSet = mutableSetOf<Char>()
            sentence.forEach {
                charSet.add(it)
            }
            return charSet.size == 26
        }
    }
}