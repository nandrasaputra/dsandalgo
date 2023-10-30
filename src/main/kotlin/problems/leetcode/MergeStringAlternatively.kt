package problems.leetcode

/*
*   leetcode: 1768. Merge Strings Alternately
*   https://leetcode.com/problems/merge-strings-alternately/submissions/
*/

object MergeStringAlternatively {
    fun mergeAlternately(word1: String, word2: String): String {
        val result = StringBuilder()
        val isWord1IsLonger = word1.length >= word2.length
        val minWord: String
        val maxWord: String

        if (isWord1IsLonger) {
            minWord = word2
            maxWord = word1
        } else {
            minWord = word1
            maxWord = word2
        }

        for(index in minWord.indices) {
            result.append(word1[index])
            result.append(word2[index])
        }

        result.append(maxWord.substring(minWord.length,maxWord.length))

        return result.toString()
    }
}