package problems.leetcode

/*
*   Leetcode: 905. Sort Array By Parity
*   https://leetcode.com/problems/sort-array-by-parity/
*/

object SortArrayByParity {
    fun sortArrayByParity(A: IntArray): IntArray {
        val evenNumberList = mutableListOf<Int>()
        val oddNumberList = mutableListOf<Int>()

        A.forEach {
            if (it % 2 == 0) {
                evenNumberList.add(it)
            } else {
                oddNumberList.add(it)
            }
        }

        return evenNumberList.apply {
            addAll(oddNumberList)
        }.toIntArray()
    }
}