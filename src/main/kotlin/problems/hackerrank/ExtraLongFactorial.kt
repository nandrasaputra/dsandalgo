package problems.hackerrank

import java.math.BigInteger
import java.util.*

/*
*   HackerRank: Extra Long Factorial Problem
*   https://www.hackerrank.com/challenges/extra-long-factorials/problem
*/

// Use BigInteger to handle very big number
fun extraLongFactorials(n: Int): Unit {
    var result: BigInteger = BigInteger.valueOf(1)
    for (number in 1..n) {
        result *= BigInteger.valueOf(number.toLong())
    }
    println(result)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    extraLongFactorials(n)
}