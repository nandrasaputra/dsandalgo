package problems.leetcode

/*
*       LeetCode Problem : MissingNumber
*       https://leetcode.com/problems/missing-number/
*
*       example:
*       Input: nums = [3,0,1]
*       Output: 2
*       Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
*       2 is the missing number in the range since it does not appear in nums.
* */

object MissingNumber {
    class Solution {
        fun missingNumber(nums: IntArray): Int {
            val numSize = nums.size
            var actualSumNumber = 0
            var expectedSumNumber = 0
            for (number in 0..numSize) {
                expectedSumNumber += number
            }
            nums.forEach {
                actualSumNumber += it
            }
            return expectedSumNumber - actualSumNumber
        }
    }
}