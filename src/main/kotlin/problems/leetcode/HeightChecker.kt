package problems.leetcode

/*
*   leetcode: 1051. Height Checker
*   https://leetcode.com/problems/height-checker/submissions/
*/

object HeightChecker {
    fun heightChecker(heights: IntArray): Int {
        var result = 0
        val sortedHeight = heights.sorted()
        for(index in heights.indices) {
            if (heights[index] != sortedHeight[index])
                result++
        }
        return result
    }
}