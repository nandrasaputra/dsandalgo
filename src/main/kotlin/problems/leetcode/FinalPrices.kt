package problems.leetcode

/*
*   leetcode: 1475. Final Prices With a Special Discount in a Shop
*   https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
*/

object FinalPrices {
    fun finalPrices(prices: IntArray): IntArray {
        val result = IntArray(prices.size) {0}
        for((index, value) in prices.withIndex()) {
            val startIndex = index + 1
            var isSpecialPriceFound = false
            for (nextIndex in startIndex until prices.size) {
                val nextValue = prices[nextIndex]
                if (nextValue <= value) {
                    isSpecialPriceFound = true
                    result[index] = value - nextValue
                    break
                }
            }
            if (!isSpecialPriceFound) {
                result[index] = value
            }
        }
        return result
    }
}