package other.hackerranktutorialchallenges.insertionsort

/*
*   HackerRank: Insertion Sort - Part 2
*   https://www.hackerrank.com/challenges/insertionsort2/problem
*/

fun insertionSort2(n: Int, arr: Array<Int>): Unit {
    var unsortedIndex = 1
    while (unsortedIndex <= arr.size-1) {
        val compareElement = arr[unsortedIndex]
        for (index in (unsortedIndex-1) downTo 0) {
            if (compareElement > arr[index]) {
                arr[index+1] = compareElement
                break
            } else {
                arr[index+1] = arr[index]
                if (index == 0) {
                    arr[index] = compareElement
                }
            }
        }
        unsortedIndex++
        printArray(arr)
    }
}

private fun printArray(arr: Array<Int>) {
    arr.forEach {
        print("$it ")
    }
    println()
}