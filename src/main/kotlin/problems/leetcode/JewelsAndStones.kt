package problems.leetcode

/*
*   Leetcode: 771. Jewels and Stones
*   https://leetcode.com/problems/jewels-and-stones/
*/

object JewelsAndStones {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        val charCountMap = mutableMapOf<Char, Int>()
        stones.forEach {
            charCountMap[it] = charCountMap.getOrDefault(it, 0) + 1
        }
        var result = 0
        jewels.forEach {
            result += charCountMap.getOrDefault(it, 0)
        }
        return result
    }
}