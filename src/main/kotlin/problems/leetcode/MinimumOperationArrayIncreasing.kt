package problems.leetcode

/*
*   Leetcode: 1827. Minimum Operations to Make the Array Increasing
*   https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/
*/

object MinimumOperationArrayIncreasing {
    fun minOperations(nums: IntArray): Int {
        var result = 0
        for (index in 1 until nums.size) {
            if(nums[index] <= nums[index-1]) {
                val numberToAdd = nums[index-1] - nums[index] + 1
                nums[index] += numberToAdd
                result += numberToAdd
            }
        }
        return result
    }
}