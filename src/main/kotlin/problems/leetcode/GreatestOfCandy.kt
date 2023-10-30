package problems.leetcode

/*
*   Leetcode: Kids with the Greatest Number of Candies
*   https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
*/
object GreatestOfCandy {
    class Solution {
        fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
            val result = BooleanArray(candies.size) {false}
            var greatestCandies = 0
            candies.forEach {
                if (it > greatestCandies) {
                    greatestCandies = it
                }
            }
            for ((index, value) in candies.withIndex()) {
                if (value + extraCandies >= greatestCandies) {
                    result[index] = true
                }
            }
            return result
        }
    }
}