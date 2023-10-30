package problems.hackerrank

/*
*   HackerRank: Service Lane
*   https://www.hackerrank.com/challenges/service-lane/problem
*/

fun serviceLane(n: Int, width: Array<Int>, cases: Array<Array<Int>>): Array<Int> {
    val result = mutableListOf<Int>()
    for (index in cases.indices) {
        val i = cases[index][0]
        val j = cases[index][1]
        var minWidth = Int.MAX_VALUE
        for (highwayPoint in i..j) {
            if (width[highwayPoint] < minWidth) {
                minWidth = width[highwayPoint]
            }
        }
        result.add(minWidth)
    }
    return result.toTypedArray()
}