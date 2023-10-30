package problems.hackerrank

import java.util.*

/*
*   HackerRank Problem : Hash Tables: Ice Cream Parlor
*   https://www.hackerrank.com/challenges/ctci-ice-cream-parlor/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=search
* */
/*
fun whatFlavors(cost: Array<Int>, money: Int): Unit {
    val costToIndexMap = mutableMapOf<Int, Int>()
    for ((index, costElement) in cost.withIndex()) {
        val lookupValue = money - costElement
        if (costToIndexMap.containsKey(lookupValue)) {
            val firstIndex = costToIndexMap[lookupValue]!!
            println("${firstIndex + 1} ${index + 1}")
            break
        } else {
            costToIndexMap[costElement] = index
        }
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val money = scan.nextLine().trim().toInt()

        val n = scan.nextLine().trim().toInt()

        val cost = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        whatFlavors(cost, money)
    }
}*/


/*
*   HackerRank Problem : Hash Tables: Ice Cream Parlor
*   https://www.hackerrank.com/challenges/icecream-parlor/problem
*/

fun icecreamParlor(m: Int, arr: Array<Int>): Array<Int> {
    val costToIndexMap = mutableMapOf<Int, Int>()
    val result = Array(2) {0}
    for ((index, costElement) in arr.withIndex()) {
        val lookupValue = m - costElement
        if (costToIndexMap.containsKey(lookupValue)) {
            val firstIndex = costToIndexMap[lookupValue]!!
            result[0] = firstIndex + 1
            result[1] = index + 1
            break
        } else {
            costToIndexMap[costElement] = index
        }
    }
    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val m = scan.nextLine().trim().toInt()

        val n = scan.nextLine().trim().toInt()

        val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        val result = icecreamParlor(m, arr)

        println(result.joinToString(" "))
    }
}
