package problems.leetcode

// https://leetcode.com/problems/summary-ranges/?envType=study-plan-v2&envId=top-interview-150
object SummaryRanges {
    fun summaryRanges(nums: IntArray): List<String> {
        val result = mutableListOf<String>()
        var currentIndex = 0
        while (currentIndex < nums.size) {
            val currentResult = mutableSetOf<Int>()
            for (innerIndex in currentIndex until nums.size) {
                val currentValue = nums[innerIndex]
                currentResult.add(currentValue)
                if (innerIndex + 1 == nums.size || currentValue + 1 != nums[innerIndex + 1]) {
                    currentIndex = innerIndex + 1
                    break
                }
            }
            result.apply {
                if (currentResult.size == 1) {
                    add("${currentResult.first()}")
                } else {
                    add("${currentResult.first()}->${currentResult.last()}")
                }
            }
        }
        return result
    }
}