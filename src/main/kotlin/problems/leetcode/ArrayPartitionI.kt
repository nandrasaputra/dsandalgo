package problems.leetcode

/*
*   561. Array Partition I
*   https://leetcode.com/problems/array-partition-i/
*/

object ArrayPartitionI {
    fun arrayPairSum(nums: IntArray): Int {
        var result = 0
        nums.sorted().let { sortedArray ->
            var index = 0
            while (index < sortedArray.size) {
                result += sortedArray[index]
                index += 2
            }
        }
        return result
    }
}