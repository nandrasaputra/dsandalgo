package problems.hackerrank

import java.util.*

/*
*   HackerRank: LonelyInteger
*   https://www.hackerrank.com/challenges/lonely-integer/problem
*/

/*
*   if we xor a number with itself, the result will be 0
*   if we xor a number with 0, the result will be the number itself
*   we could use this approach to get the lonely number (assuming the input always odd)
* */
fun lonelyinteger(a: Array<Int>): Int {
    var result = 0
    for (element in a) {
        result = result xor element
    }

    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = lonelyinteger(a)

    println(result)
}