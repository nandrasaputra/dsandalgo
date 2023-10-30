package problems.hackerrank

/*
*   Hacker Rank: Electronics Shop
*   https://www.hackerrank.com/challenges/electronics-shop/problem
*/

fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    var maxValue = -1
    keyboards.sortDescending()
    drives.sort()
    var kIndex = 0
    var dIndex = 0

    while (kIndex < keyboards.size) {
        while (dIndex < drives.size) {
            if (keyboards[kIndex] + drives[dIndex] > b) break
            if (keyboards[kIndex] + drives[dIndex] > maxValue) {
                maxValue = keyboards[kIndex] + drives[dIndex]
            }
            dIndex++
        }
        kIndex++
    }

    return maxValue
}

//  O(n^2) Solution
/*
fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {

    var maxValue = -1

    for (kElement in keyboards) {
        for (dElement in drives) {
            if (kElement + dElement <= b) {
                maxValue = Math.max(maxValue, kElement + dElement)
            }
        }
    }

    return maxValue
}*/
