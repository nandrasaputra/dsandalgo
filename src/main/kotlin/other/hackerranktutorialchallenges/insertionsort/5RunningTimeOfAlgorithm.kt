package other.hackerranktutorialchallenges.insertionsort

/*
*   HackerRank: Insertion Sort Tutorial 5, Running Time of Algorithm
*   https://www.hackerrank.com/challenges/runningtime/problem
*/

fun runningTime(arr: IntArray): Int {
    var shiftCount = 0
    for (i in 1 until arr.size) {
        val value = arr[i]
        var j = i - 1
        while (j >= 0 && arr[j] > value) {
            arr[j + 1] = arr[j]
            j -= 1
            shiftCount++
        }
        arr[j + 1] = value
    }
    return shiftCount
}