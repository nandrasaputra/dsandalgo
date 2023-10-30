package problems.hackerrank

import java.lang.StringBuilder

/*
*   HackerRank: Cavity Map
*   https://www.hackerrank.com/challenges/cavity-map/problem
*   TODO: BELOW IS UN-OPTIMAL SOLUTION
* */

fun cavityMap(grid: Array<String>): Array<String> {
    val n = grid.size
    if (n in 0..2) {
        return grid
    } else {
        val result = grid.copyOf()
        for (a in 1..(n-2)) {
            for (b in 1..(n-2)) {
                val target = grid[a][b].toInt()
                val top = grid[a-1][b].toInt()
                val right = grid[a][b+1].toInt()
                val bottom = grid[a+1][b].toInt()
                val left = grid[a][b-1].toInt()
                if (target > top && target > right && target > bottom && target > left) {
                    val modifiedStringBuilder = StringBuilder(grid[a])
                    modifiedStringBuilder[b] = 'X'
                    result[a] = modifiedStringBuilder.toString()
                }
            }
        }
        return result
    }
}