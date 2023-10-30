package problems.leetcode

object RemoveDupEleFromSortedArray {

    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150

    fun removeDuplicates(nums: IntArray): Int {
        var currentIndex = 0
        for (movingIndex in 1 until nums.size) {
            if (nums[currentIndex] != nums[movingIndex]) {
                currentIndex++
                nums[currentIndex] = nums[movingIndex]
            }
        }
        return currentIndex + 1
    }
}