package problems.leetcode

/*
*   leetcode: 961. N-Repeated Element in Size 2N Array
*   https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
*/

object NRepeatedElementInArray {
    fun repeatedNTimes(nums: IntArray): Int {
        val n = nums.size / 2
        val numberCountMap = mutableMapOf<Int, Int>()
        nums.forEach {
            val currentCount = numberCountMap.getOrDefault(it, 0)
            if (currentCount == (n - 1)) {
                return it
            }
            numberCountMap[it] = currentCount + 1
        }
        return 0
    }
}