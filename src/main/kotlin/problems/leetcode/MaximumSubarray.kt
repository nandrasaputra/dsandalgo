package problems.leetcode

import kotlin.math.max

object MaximumSubarray {
    fun maxSubArray(nums: IntArray): Int {
        val resultArray = IntArray(nums.size)

        for (index in nums.indices) {
            if (index == 0) {
                resultArray[index] = nums[index]
            } else {
                val maxResultAtIndex = max(nums[index], resultArray[index - 1] + nums[index])
                resultArray[index] = maxResultAtIndex
            }
        }

        return resultArray.max()
    }
}