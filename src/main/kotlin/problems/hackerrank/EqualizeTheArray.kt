package problems.hackerrank

/*
*   HackerRank: Equalize The Array
*   https://www.hackerrank.com/challenges/equality-in-a-array/problem
*/

fun equalizeArray(arr: Array<Int>): Int {
    val numberMap = mutableMapOf<Int, Int>()
    arr.forEach {
        numberMap[it] = numberMap.getOrDefault(it, 0) + 1
    }
    val maxEntry = numberMap.maxByOrNull { it: Map.Entry<Int, Int> -> it.value }
    val totalValue = numberMap.values.sum()
    return totalValue - (maxEntry?.value ?: 0)
}