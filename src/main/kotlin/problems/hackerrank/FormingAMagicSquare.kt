package problems.hackerrank

/*
*   HackerRank: Forming a Magic Square
*   https://www.hackerrank.com/challenges/magic-square-forming/problem
*/

fun formingMagicSquare(s: Array<Array<Int>>): Int {
    var minimalTotalCost = Int.MAX_VALUE
    val allPossibleMagicSquare =
        arrayOf(
            arrayOf(
                arrayOf(8,1,6), arrayOf(3,5,7), arrayOf(4,9,2)
            ),
            arrayOf(
                arrayOf(6,1,8), arrayOf(7,5,3), arrayOf(2,9,4)
            ),
            arrayOf(
                arrayOf(4,9,2), arrayOf(3,5,7), arrayOf(8,1,6)
            ),
            arrayOf(
                arrayOf(2,9,4), arrayOf(7,5,3), arrayOf(6,1,8)
            ),
            arrayOf(
                arrayOf(8,3,4), arrayOf(1,5,9), arrayOf(6,7,2)
            ),
            arrayOf(
                arrayOf(4,3,8), arrayOf(9,5,1), arrayOf(2,7,6)
            ),
            arrayOf(
                arrayOf(6,7,2), arrayOf(1,5,9), arrayOf(8,3,4)
            ),
            arrayOf(
                arrayOf(2,7,6), arrayOf(9,5,1), arrayOf(4,3,8)
            )
    )

    allPossibleMagicSquare.forEach {
        var totalArrayAbsoluteArrayDiff = 0
        for (index in s.indices) {
            totalArrayAbsoluteArrayDiff += findAbsoluteDiffValueOfArray(s[index], it[index])
        }
        if (totalArrayAbsoluteArrayDiff < minimalTotalCost) {
            minimalTotalCost = totalArrayAbsoluteArrayDiff
        }
    }

    return minimalTotalCost
}

private fun findAbsoluteDiffValueOfArray(arrayOne: Array<Int>, arrayTwo: Array<Int>) : Int {
    var result = 0
    for (index in arrayOne.indices) {
        result += Math.abs(arrayOne[index] - arrayTwo[index])
    }
    return result
}