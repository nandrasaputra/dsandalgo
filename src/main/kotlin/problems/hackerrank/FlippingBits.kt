package problems.hackerrank

/*
*   HackerRank: FlippingBits
*   https://www.hackerrank.com/challenges/flipping-bits/problem
*/
fun flippingBits(n: Long): Long {
    val maxValue: Long = (Math.pow((2).toDouble(), (32).toDouble()) -1).toLong()
    return maxValue xor n
}