package problems.hackerrank

/*
*   HackerRank: Find Median
*   https://www.hackerrank.com/challenges/find-the-median/problem
*/

fun findMedian(arr: Array<Int>): Int {
    arr.sort()
    val targetIndex = ((arr.size - 2) / 2) + 1
    return arr[targetIndex]
}