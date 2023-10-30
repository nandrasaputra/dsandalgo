package problems.leetcode

/*
*   Leetcode: 1304. Find N Unique Integers Sum up to Zero
*   https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/submissions/
*/

object SumZero {
    fun sumZero(n: Int): IntArray {
        if (n == 0) {
            return IntArray(1) {0}
        }
        val result = mutableListOf<Int>()
        val halfNumber = n / 2
        if (n % 2 == 0) {
            for (negativeNumber in (-1 * halfNumber)..(-1 * 1)) {
                result.add(negativeNumber)
            }
            for (number in 1..halfNumber) {
                result.add(number)
            }
        } else {
            for (negativeNumber in (-1 * halfNumber)..(-1 * 1)) {
                result.add(negativeNumber)
            }
            result.add(0)
            for (number in 1..halfNumber) {
                result.add(number)
            }
        }
        return result.toIntArray()
    }
}