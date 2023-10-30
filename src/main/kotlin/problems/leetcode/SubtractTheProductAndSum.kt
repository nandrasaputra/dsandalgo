package problems.leetcode

/*
*   Leetcode: 1281. Subtract the Product and Sum of Digits of an Integer
*   https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
*/

object SubtractTheProductAndSum {
    fun subtractProductAndSum(n: Int): Int {
        var productOfDigits = 1
        var sumOfDigits = 0
        n.toString().forEach {
            val digit = it.toString().toInt()
            productOfDigits *= digit
            sumOfDigits += digit
        }
        return productOfDigits - sumOfDigits
    }
}