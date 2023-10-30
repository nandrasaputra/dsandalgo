package problems.leetcode

/*
*   leetcode: 1748. Sum of Unique Elements
*   https://leetcode.com/problems/sum-of-unique-elements/
*/

object SumOfUniqueElements {
    fun sumOfUnique(nums: IntArray): Int {
        val numberMap = Array<Int>(101) {0}
        var result = 0
        nums.forEach {
            val currentCount = numberMap[it]
            if (currentCount == 0) {
                result += it
            } else if (currentCount == 1) {
                result -= it
            }
            numberMap[it]++
        }
        return result
    }
}