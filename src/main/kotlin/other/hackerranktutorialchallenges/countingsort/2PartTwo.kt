package other.hackerranktutorialchallenges.countingsort

/*
*   HackerRank: Counting Sort Part 2
*   https://www.hackerrank.com/challenges/countingsort2/problem
*/

fun countingSort2(arr: Array<Int>): Array<Int> {
    val countArray = Array(100) {0}
    arr.forEach {
        countArray[it]++
    }
    val sortedArray = Array(arr.size){0}
    var sortedArrayCurrentIndex = 0
    for ((index, value) in countArray.withIndex()) {
        if (value != 0) {
            for (count in 1..value) {
                sortedArray[sortedArrayCurrentIndex] = index
                sortedArrayCurrentIndex++
            }
        }
    }
    return sortedArray
}