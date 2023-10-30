package problems.leetcode

/*
*   Leetcode: 1313. Decompress Run-Length Encoded List
*   https://leetcode.com/problems/decompress-run-length-encoded-list/
*/

object DecompressRunLengthEncodedList {
    fun decompressRLElist(nums: IntArray): IntArray {
        val result = mutableListOf<Int>()
        var currentIndex = 0
        while (currentIndex <= nums.size -2) {
            val frequency = nums[currentIndex]
            val value = nums[currentIndex+1]
            val currentResult = Array<Int>(frequency) {value}
            result.addAll(currentResult)
            currentIndex += 2
        }
        return result.toIntArray()
    }
}