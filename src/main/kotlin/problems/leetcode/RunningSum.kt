package problems.leetcode

/*
*   Leetcode: Running Sum of 1D Array
*   https://leetcode.com/problems/running-sum-of-1d-array/
*/

object RunningSum {
    class Solution {
        fun runningSum(nums: IntArray): IntArray {
            val result = IntArray(nums.size) {0}
            var previousSum = 0
            for(index in nums.indices) {
                result[index] = nums[index] + previousSum
                previousSum+= nums[index]
            }
            return result
        }
    }
}