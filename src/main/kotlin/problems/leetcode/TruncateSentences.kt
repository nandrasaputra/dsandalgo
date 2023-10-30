package problems.leetcode

/*
*   Leetcode: 1816. Truncate Sentence
*   https://leetcode.com/problems/truncate-sentence/
*/

object TruncateSentences {
    fun truncateSentence(s: String, k: Int): String {
        return s.split(" ").take(k).reduce { last, next ->
            last + " "+ next
        }
    }
}