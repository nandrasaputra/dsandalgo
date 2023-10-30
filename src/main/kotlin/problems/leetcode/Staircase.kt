package problems.leetcode

/*
*   Leetcode: 70. Climbing Stairs
*   https://leetcode.com/problems/climbing-stairs/
*/

object Staircase {
    fun climbStairs(n: Int): Int {
        val stepsAtNArray = Array(n+1) {0}
        stepsAtNArray[0] = 1
        stepsAtNArray[1] = 1
        for (index in 2..n) {
            stepsAtNArray[index] = stepsAtNArray[index-1] + stepsAtNArray[index-2]
        }
        return stepsAtNArray[n]
    }
}