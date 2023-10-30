package problems.leetcode

/*
*   Leetcode: 1822. Sign of the Product of an Array
*   https://leetcode.com/problems/sign-of-the-product-of-an-array/
*/

object SignOfProduct {
    fun arraySign(nums: IntArray): Int {
        var result = 1
        for (number in nums) {
            if (number == 0) {
                return 0
            } else if (number < 0) {
                result = -result
            }
        }
        return result
    }
}