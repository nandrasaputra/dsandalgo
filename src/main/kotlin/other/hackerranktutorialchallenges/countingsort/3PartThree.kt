package other.hackerranktutorialchallenges.countingsort

/*
*   HackerRank: Counting Sort Part 3
*   https://www.hackerrank.com/challenges/countingsort3/problem
*/

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val N: Int = sc.nextInt()

    val inputArray = IntArray(N)
    val numberCountArray = IntArray(100)

    for (index in 0 until N) {
        inputArray[index] = sc.nextInt()
        sc.next()
    }
    sc.close()

    for (index in 0 until N) {
        numberCountArray[inputArray[index]]++
    }

    for (index in 1..99) {
        numberCountArray[index] = numberCountArray[index] + numberCountArray[index - 1]
    }

    for (index in 0..99) {
        print(numberCountArray[index].toString() + " ")
    }
}