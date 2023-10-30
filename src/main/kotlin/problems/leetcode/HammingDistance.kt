package problems.leetcode

/*
*   461. Hamming Distance
*   https://leetcode.com/problems/hamming-distance/
*/

object HammingDistance {
    fun hammingDistance(x: Int, y: Int): Int {
        return Integer.bitCount(x xor y)
    }
}