package problems.leetcode

/*
*   leetcode: 657. Robot Return to Origin
*   https://leetcode.com/problems/robot-return-to-origin/
*/

object RobotReturnToOrigin {
    fun judgeCircle(moves: String): Boolean {
        var verticalMagnitude = 0
        var horizontalMagnitude = 0
        moves.forEach {
            when(it) {
                'U' -> { verticalMagnitude++ }
                'D' -> { verticalMagnitude-- }
                'L' -> { horizontalMagnitude-- }
                else -> { horizontalMagnitude++ }
            }
        }
        return (verticalMagnitude == 0 && horizontalMagnitude == 0)
    }
}