package problems.hackerrank

/*
*   HackerRank: Permuting Two Arrays
*   https://www.hackerrank.com/challenges/two-arrays/problem
*/

fun twoArrays(k: Int, A: Array<Int>, B: Array<Int>): String {
    val sortedA = A.sortedDescending()
    val sortedB = B.sorted()
    for (index in sortedA.indices) {
        if (sortedA[index] + sortedB[index] < k) {
            return "NO"
        }
    }
    return "YES"
}