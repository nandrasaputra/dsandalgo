package problems.leetcode

/*
*   Leetcode: 1470. Shuffle the Array
*   https://leetcode.com/problems/shuffle-the-array/
*/

object ShuffleArray {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val resultArray = IntArray(nums.size) {0}
        var currentYIndex = n
        var elementIndex = 0
        for (currentXIndex in 0 until n) {
            val x = nums[currentXIndex]
            val y = nums[currentYIndex]
            resultArray[elementIndex] = x
            resultArray[elementIndex+1] = y
            elementIndex += 2
            currentYIndex++
        }
        return resultArray
    }
}