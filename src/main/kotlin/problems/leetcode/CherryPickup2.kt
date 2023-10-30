package problems.leetcode

/*
*       LeetCode Problem : CherryPickup2
*       https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/571/week-3-december-15th-december-21st/3571/
* */

object CherryPickup2 {
    class Solution {
        fun cherryPickup(grid: Array<IntArray>): Int {
            return CherryPickupSolver(grid).getMaxCherryPickup()
        }
    }

    class CherryPickupSolver(private val grid: Array<IntArray>) {

        private val cachedResult :MutableMap<Pair<Pair<Int, Int>, Pair<Int, Int>>, Int> = mutableMapOf()

        fun getMaxCherryPickup() : Int {
            if (grid.isEmpty()) {
                return 0
            } else {
                if (grid[0].isEmpty()) {
                    return 0
                }
                else {
                    return findMaxCherryPickup()
                }
            }
        }

        private fun findMaxCherryPickup() : Int {
            return pickupCherry(Pair(0, 0), Pair(0, grid[0].size - 1))
        }

        private fun pickupCherry(robotAPosition: Pair<Int, Int>, robotBPosition: Pair<Int, Int>) : Int {

            cachedResult[Pair(robotAPosition, robotBPosition)]?.let {
                return it
            }

            if (robotAPosition.first == grid.size) {	// BASE CASE
                return 0
            }

            // Pickup Cherry
            var currentCherry = 0
            currentCherry += grid[robotAPosition.first][robotAPosition.second]
            if (robotBPosition.second != robotAPosition.second) {
                currentCherry += grid[robotBPosition.first][robotBPosition.second]
            }

            var maxCherryDescendant = 0
            for (x in -1..1) {
                for (y in -1..1) {
                    val robotANextPosition = Pair(robotAPosition.first + 1, robotAPosition.second + x)
                    val robotBNextPosition = Pair(robotBPosition.first + 1, robotBPosition.second + y)
                    if (isValidJPosition(robotANextPosition) && isValidJPosition(robotBNextPosition)) {
                        val localResult = pickupCherry(robotANextPosition, robotBNextPosition)
                        if (localResult > maxCherryDescendant) {
                            maxCherryDescendant = localResult
                        }
                    }
                }
            }

            val grandResult = currentCherry + maxCherryDescendant

            // Cached the result
            cachedResult[Pair(robotAPosition, robotBPosition)] = grandResult

            return grandResult
        }

        private fun isValidJPosition(position: Pair<Int, Int>) : Boolean {
            return !(position.second < 0 || position.second > grid[0].size - 1)
        }
    }

    fun main() {
        print(Solution().cherryPickup(
            arrayOf(
                intArrayOf(1,0,0,3),
                intArrayOf(0,0,0,3),
                intArrayOf(0,0,3,3),
                intArrayOf(9,0,3,3)
            )
        ))
    }
}