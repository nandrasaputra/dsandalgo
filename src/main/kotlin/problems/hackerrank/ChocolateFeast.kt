package problems.hackerrank

/*
*   HackerRank: Chocolate Feast
*   https://www.hackerrank.com/challenges/chocolate-feast/problem
*/

fun chocolateFeast(n: Int, c: Int, m: Int): Int {
    var chocolateCount = n/c
    var chocolateNow = chocolateCount
    var chocolateWrapper = 0
    while (chocolateNow > 0) {
        chocolateWrapper += chocolateNow

        val chocoGain = chocolateWrapper / m
        val usedWrapper = chocoGain * m
        val wrapperLeft = chocolateWrapper - usedWrapper

        chocolateNow = chocoGain
        chocolateCount += chocoGain
        chocolateWrapper = wrapperLeft
    }

    return chocolateCount
}