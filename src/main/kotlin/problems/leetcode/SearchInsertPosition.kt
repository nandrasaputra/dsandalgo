package problems.leetcode

import kotlin.math.round

object SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        if (nums.size == 1) return nums.first()
        var maxPointer = nums.size - 1
        var minPointer = 0
        while (minPointer <= maxPointer) {
            var midPointer = (maxPointer + minPointer) / 2

            if (target == nums[midPointer]) return midPointer
            if (target > nums[midPointer]) {
                minPointer = midPointer + 1
            } else {
                maxPointer = midPointer - 1
            }
        }

        return minPointer
    }
}

fun main() {
    print(SearchInsertPosition.searchInsert(intArrayOf(1,3,5,6), 0))
}