package problems.leetcode

/*
*   Leetcode: 1207. Unique Number of Occurrences
*   https://leetcode.com/problems/unique-number-of-occurrences/
*/

object UniqueNumberOfOccurrence {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val numberCountMap = mutableMapOf<Int, Int>()
        val numberCountSet = mutableSetOf<Int>()
        arr.forEach {
            numberCountMap[it] = numberCountMap.getOrDefault(it, 0) + 1
        }
        numberCountMap.values.forEach {
            numberCountSet.add(it)
        }
        return numberCountMap.values.size == numberCountSet.size
    }
}