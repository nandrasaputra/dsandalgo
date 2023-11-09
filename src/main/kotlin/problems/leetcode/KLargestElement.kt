package problems.leetcode

import java.util.PriorityQueue

object KLargestElement {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        nums.sort()
        return nums[nums.size - k]
    }
}