package problems.hackerrank

/*
*   HackerRank: Manasa and Stones
*   https://www.hackerrank.com/challenges/manasa-and-stones/problem
*/

fun stones(n: Int, a: Int, b: Int): Array<Int> {
    val setOfEndStone = mutableSetOf<Int>()
    for(i in 0 until n) {
        val j = n - 1 - i

        val stoneA = a * i
        val stoneB = b * j
        val result = stoneA + stoneB
        setOfEndStone.add(result)
    }
    return setOfEndStone.toTypedArray().sortedArray()
}
