package problems.hackerrank

import java.util.*
/*
*       HackerRank: MaximizingXor
*       https://www.hackerrank.com/challenges/maximizing-xor/problem
*/
fun maximizingXor(l: Int, r: Int): Int {
    val xored = l xor r
    val significantBit = 31 - Integer.numberOfLeadingZeros(xored)
    return (1 shl significantBit + 1) - 1
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val l = scan.nextLine().trim().toInt()

    val r = scan.nextLine().trim().toInt()

    val result = maximizingXor(l, r)

    println(result)
}