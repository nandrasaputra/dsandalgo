package problems.leetcode

import kotlin.math.min

// https://leetcode.com/problems/minimum-size-subarray-sum/submissions/1088203415/?envType=study-plan-v2&envId=top-interview-150
object MinSizeSubArray {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var currentMinSubArray = 0
        var currentSum = 0

        var frontIndex = 0
        var endIndex = 0

        while (endIndex < nums.size) {
            currentSum += nums[endIndex]

            if (currentSum >= target) {
                if (currentMinSubArray > 0) {
                    currentMinSubArray = min(endIndex - frontIndex + 1, currentMinSubArray)
                } else {
                    currentMinSubArray = endIndex - frontIndex + 1
                }
            }

            while (frontIndex < endIndex && currentSum > target) {
                currentSum -= nums[frontIndex]
                frontIndex++

                if (currentSum >= target) {
                    currentMinSubArray = min(endIndex - frontIndex + 1, currentMinSubArray)
                }
            }

            endIndex++
        }

        return currentMinSubArray
    }
}