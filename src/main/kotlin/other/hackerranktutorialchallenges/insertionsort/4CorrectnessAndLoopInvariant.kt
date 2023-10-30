package other.hackerranktutorialchallenges.insertionsort

/*
*   HackerRank Tutorial (Insertion Sort) 4 : Correctness and Loop Invariant
*   https://www.hackerrank.com/challenges/correctness-invariant/problem
*/

fun insertionSort(A: IntArray) {
    for (i in 1 until A.size) {
        val value = A[i]
        var j = i - 1
        while (j >= 0 && A[j] > value) {
            A[j + 1] = A[j]
            j -= 1
        }
        A[j + 1] = value
    }
    printArray(A)
}

fun printArray(ar: IntArray) {
    for (n in ar) {
        print("$n ")
    }
}