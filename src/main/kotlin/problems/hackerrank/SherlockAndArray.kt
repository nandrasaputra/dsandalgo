package problems.hackerrank

/*
*   HackerRank: Sherlock and Array
*   https://www.hackerrank.com/challenges/sherlock-and-array/problem
*/

fun balancedSums(arr: Array<Int>): String {
    var leftIndex = 0
    var rightIndex = arr.size-1
    var leftSum = arr[leftIndex]
    var rightSum = arr[rightIndex]

    while (leftIndex <= rightIndex) {
        if (leftSum == rightSum && leftIndex == rightIndex) {
            return "YES"
        }

        if (leftSum < rightSum) {
            leftIndex++
            leftSum += arr[leftIndex]
        } else if (leftSum > rightSum) {
            rightIndex--
            rightSum += arr[rightIndex]
        } else {
            leftIndex++
            leftSum += arr[leftIndex]
            rightIndex--
            rightSum += arr[rightIndex]
        }
    }

    return "NO"
}