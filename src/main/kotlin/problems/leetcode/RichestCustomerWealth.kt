package problems.leetcode

/*
*   LeetCode: Richest Customer Wealth
*   https://leetcode.com/problems/richest-customer-wealth/
*/

object RichestCustomerWealth {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var maxWealth = 0
        accounts.forEach {
            var currentWealth = 0
            it.forEach {
                currentWealth += it
            }
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth
            }
        }
        return maxWealth
    }
}