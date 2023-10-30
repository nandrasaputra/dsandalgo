package problems.hackerrank

/*
*   HackerRank: Missing Numbers
*   https://www.hackerrank.com/challenges/missing-numbers/problem
*/

fun missingNumbers(arr: Array<Int>, brr: Array<Int>): Array<Int> {

    val frequencyMap = mutableMapOf<Int, Int>()

    brr.forEach {
        frequencyMap[it] = frequencyMap.getOrDefault(it, 0) + 1
    }

    arr.forEach {
        frequencyMap[it] = frequencyMap.getOrDefault(it, 0) - 1
    }

    val result = mutableListOf<Int>()

    frequencyMap.toSortedMap(compareBy { it }).forEach { (t, u) ->
        if (u != 0) {
            result.add(t)
        }
    }

    return result.toTypedArray()
}