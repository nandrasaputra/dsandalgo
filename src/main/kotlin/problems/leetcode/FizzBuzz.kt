package problems.leetcode

/*
*       LeetCode Problem : FizzBuzz
*       https://leetcode.com/problems/fizz-buzz/
* */

object FizzBuzz {
    class Solution {
        fun fizzBuzz(n: Int): List<String> {
            val result = mutableListOf<String>()
            for (i in 1..n) {
                if (i % 3 == 0 && i % 5 == 0) {
                    result.add("FizzBuzz")
                } else if (i % 3 == 0) {
                    result.add("Fizz")
                } else if (i % 5 == 0) {
                    result.add("Buzz")
                } else {
                    result.add(i.toString())
                }
            }
            return result
        }
    }
}