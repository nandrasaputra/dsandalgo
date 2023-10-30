package problems.hackerrank

/*
*   HackerRank Problem: Sum Vs Xor
*   https://www.hackerrank.com/challenges/sum-vs-xor/problem
*/

fun sumXor(n: Long): Long {
    if (n == (0.toLong())) {
        return 1
    } else {
        val twoBitRepresentation = n.toString(2).toCharArray()
        var number = 0
        val base = 2
        for (index in twoBitRepresentation.indices) {
            if (twoBitRepresentation[index] == '0') {
                number++
            }
        }
        return Math.pow(base.toDouble(),number.toDouble()).toLong()
    }
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toLong()

    val result = sumXor(n)

    println(result)
}