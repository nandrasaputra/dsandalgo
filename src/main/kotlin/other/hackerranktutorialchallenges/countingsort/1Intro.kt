package other.hackerranktutorialchallenges.countingsort

/*
*   HackerRank: Counting Sort Part 1
*   https://www.hackerrank.com/challenges/countingsort1/problem
*/

fun countingSort(arr: Array<Int>): Array<Int> {
    val countArray = Array(100) {0}
    arr.forEach {
        countArray[it]++
    }
    return countArray
}