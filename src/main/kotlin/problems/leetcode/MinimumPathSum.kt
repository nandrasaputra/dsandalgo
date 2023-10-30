package problems.leetcode

/*
*   Leetcode: 64. Minimum Path Sum
*   https://leetcode.com/problems/minimum-path-sum/
*/

object MinimumPathSum {
    fun minPathSum(grid: Array<IntArray>): Int {
        val minPathMap = mutableMapOf<Pair<Int, Int>, Int>()
        return getMinPath(0,0,grid, minPathMap)
    }

    private fun getMinPath(x: Int, y: Int, grid: Array<IntArray>, cachedMap: MutableMap<Pair<Int, Int>, Int>) : Int {
        val targetX = grid.size-1
        val targetY = grid[0].size-1

        if (cachedMap.containsKey(Pair(x,y))) {
            return cachedMap[Pair(x,y)]!!
        }

        if (x == targetX && y == targetY) {
            return grid[x][y]
        } else if (x == targetX) {
            val result = grid[x][y] + getMinPath(x, y+1, grid, cachedMap)
            cachedMap[Pair(x,y)] = result
            return result
        } else if (y == targetY) {
            val result = grid[x][y] + getMinPath(x+1, y, grid, cachedMap)
            cachedMap[Pair(x,y)] = result
            return result
        } else {
            val result = Math.min(
                grid[x][y] + getMinPath(x, y+1, grid, cachedMap),
                grid[x][y] + getMinPath(x+1, y, grid, cachedMap)
            )
            cachedMap[Pair(x,y)] = result
            return result
        }
    }
}

/*
fun main() {
    print(
        MinimumPathSum.minPathSum(
            arrayOf(
                intArrayOf(1,2,3),
                intArrayOf(4,5,6)
            )
        )
    )
}*/
