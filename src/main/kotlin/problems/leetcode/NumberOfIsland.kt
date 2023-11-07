package problems.leetcode

// https://leetcode.com/problems/number-of-islands/description/?envType=study-plan-v2&envId=top-interview-150
object NumberOfIsland {
    fun numIslands(grid: Array<CharArray>): Int {
        var numberOfIsland = 0
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (grid[i][j] == '1') {
                    exploreLand(i,j, grid)
                    numberOfIsland++
                }
            }
        }
        return numberOfIsland
    }

    private fun exploreLand(i: Int, j: Int, grid: Array<CharArray>) {
        if (i < 0 || i > grid.size - 1 || j < 0 || j > grid[i].size -1) return
        if (grid[i][j] != '1') return
        grid[i][j] = '2'
        exploreLand(i, j-1, grid)
        exploreLand(i, j+1, grid)
        exploreLand(i-1, j, grid)
        exploreLand(i+1, j, grid)
    }
}

fun main() {
    val grid = arrayOf(
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('0', '0', '1', '0', '0'),
        charArrayOf('0', '0', '0', '1', '1')
    )
    print(NumberOfIsland.numIslands(grid))
}