package problems.leetcode

object ClimbingStairs {
    fun climbStairs(n: Int): Int {
        val stepData = IntArray(n)
        return climb(n, stepData)
    }

    private fun climb(step: Int, stepData: IntArray) : Int {
        val previousResult = stepData[step-1]

        return if (previousResult != 0) {
            previousResult
        } else {
            val result = when (step) {
                2 -> {
                    2
                }
                1 -> {
                    1
                }
                else -> {
                    climb(step - 1, stepData) + climb(step - 2, stepData)
                }
            }
            stepData[step-1] = result
            result
        }
    }
}