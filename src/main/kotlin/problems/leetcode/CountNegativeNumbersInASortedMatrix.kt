package problems.leetcode

/*
*   leetcode: 1351. Count Negative Numbers in a Sorted Matrix
*   https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
*/

object CountNegativeNumbersInASortedMatrix {
    fun countNegatives(grid: Array<IntArray>): Int {
        var result = 0
        val m = grid.size
        val n = grid[0].size
        var i = 0
        var j = n - 1
        while (i < m && j >= 0) {
            if (grid[i][j] < 0) {
                result += m - i
                j--
            } else {
                i++
            }
        }
        return result
    }
}