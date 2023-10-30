package other.hackerranktutorialchallenges.insertionsort

/*
*   HackerRank: Insertion Sort - Part 1
*   https://www.hackerrank.com/challenges/insertionsort1/problem
*/

fun insertionSort1(n: Int, arr: Array<Int>): Unit {
    val savedElement = arr[arr.size-1]
    for(index in (arr.size-2) downTo 0) {
        if (index == 0) {
            if (savedElement > arr[0]) {
                arr[1] = savedElement
            } else {
                arr[1] = arr[0]
                arr[0] = savedElement
            }
            printArray(arr)
        } else {
            if (arr[index] > savedElement) {
                arr[index+1] = arr[index]
                printArray(arr)
            } else {
                arr[index+1] = savedElement
                printArray(arr)
                break
            }
        }
    }
}

private fun printArray(arr: Array<Int>) {
    arr.forEach {
        print("$it ")
    }
    println()
}

fun main() {
    insertionSort1(10, arrayOf(2,3,4,5,6,7,8,9,10,1))
}