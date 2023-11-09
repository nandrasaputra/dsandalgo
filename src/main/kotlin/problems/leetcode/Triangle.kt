package problems.leetcode

import kotlin.math.min

object Triangle {
    fun minimumTotal(triangle: List<List<Int>>): Int {
        val history: MutableMap<Pair<Int, Int>, Int> = mutableMapOf()
        return findShortestPath(triangle, 0,0, history)
    }

    private fun findShortestPath(triangle: List<List<Int>>, col: Int, row: Int, history: MutableMap<Pair<Int, Int>, Int>): Int {
        history[Pair(col, row)]?.let {
            return it
        }

        if (col == triangle.size - 1) {
            return triangle[col][row]
        } else {
            val shortestPath = triangle[col][row] + min(findShortestPath(triangle, col+1, row, history), findShortestPath(triangle, col + 1, row+1, history))
            history[Pair(col, row)] = shortestPath
            return shortestPath
        }
    }
}