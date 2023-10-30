package problems.hackerrank

/*
*   HackerRank: Priyanka and Toys
*   https://www.hackerrank.com/challenges/priyanka-and-toys/problem
*/

fun toys(w: Array<Int>): Int {
    val sortedArray = w.sorted()
    var currentWeight = sortedArray[0]
    var containerCount = 1

    sortedArray.forEach {
        if (it > (currentWeight + 4)) {
            currentWeight = it
            containerCount++
        }
    }

    return containerCount
}