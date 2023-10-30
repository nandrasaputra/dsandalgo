package problems.hackerrank

/*
*   HackerRank: Closest Number
*   https://www.hackerrank.com/challenges/closest-numbers/problem
*/

fun closestNumbers(arr: Array<Int>): Array<Int> {
    arr.sort()
    var difference = Int.MAX_VALUE
    val resultList = mutableListOf<Int>()
    for (index in 1 until arr.size) {
        val currentDiff = Math.abs(arr[index] - arr[index - 1])
        if (currentDiff < difference) {
            difference = currentDiff
            resultList.clear()
            resultList.add(arr[index - 1])
            resultList.add(arr[index])
        } else if (currentDiff == difference) {
            resultList.add(arr[index - 1])
            resultList.add(arr[index])
        }
    }
    return resultList.toTypedArray()
}