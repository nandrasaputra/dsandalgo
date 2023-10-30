package problems.hackerrank

import java.util.*

/*
* HackerRank Problem : Max Min
* https://www.hackerrank.com/challenges/angry-children/problem
* */

fun maxMin(k: Int, arr: Array<Int>): Int {

    val n = arr.size
    val sortedArray = arr.sortedArray()

    var answer = Int.MAX_VALUE

    for (index in 0..(n-k)) {

        val minElement = sortedArray[index]
        val maxElement = sortedArray[index+k-1]

        val maxMinusMin = maxElement - minElement
        answer = Math.min(maxMinusMin, answer)

        println("maxElement = $maxElement, minElement = $minElement, maxMinusMin = $maxMinusMin")
    }

    return answer

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val k = scan.nextLine().trim().toInt()

    val arr = Array<Int>(n, { 0 })
    for (i in 0 until n) {
        val arrItem = scan.nextLine().trim().toInt()
        arr[i] = arrItem
    }

    val result = maxMin(k, arr)

    println(result)
}