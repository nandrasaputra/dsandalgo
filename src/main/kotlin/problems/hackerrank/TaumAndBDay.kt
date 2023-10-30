package problems.hackerrank

/*
*   HackerRank: Taum and BDay
*   https://www.hackerrank.com/challenges/taum-and-bday/problem
*/

fun taumBday(b: Int, w: Int, bc: Int, wc: Int, z: Int): Long {
    val bCost: Long = b.toLong() * Math.min(bc, wc + z)
    val wCost: Long = w.toLong() * Math.min(wc, bc + z)
    return bCost + wCost
}