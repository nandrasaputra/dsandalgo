package problems.leetcode

/*
*       LeetCode Problem : 4SumII
*       https://leetcode.com/problems/4sum-ii/
* */

object SumII {
    fun fourSumCount(A: IntArray, B: IntArray, C: IntArray, D: IntArray): Int {
        val abSumMap = mutableMapOf<Int, Int>()
        var result = 0
        for (aElement in A) {
            for (bElement in B) {
                abSumMap[aElement + bElement] = abSumMap.getOrDefault(aElement + bElement, 0) + 1
            }
        }

        for (cElement in C) {
            for (dElement in D) {
                val cdSum = cElement + dElement
                if (abSumMap.containsKey(-cdSum)) {
                    result += abSumMap[-cdSum]!!
                }
            }
        }

        return result
    }
}