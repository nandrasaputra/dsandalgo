package problems.leetcode

/*
*   Leetcode: 1108. Defanging an IP Address
*   https://leetcode.com/problems/defanging-an-ip-address/
*/

import java.lang.StringBuilder

object DefangingIP {
    fun defangIPaddr(address: String): String {
        val resultStringBuilder = StringBuilder()
        address.forEach {
            if (it == '.') {
                resultStringBuilder.append("[.]")
            } else {
                resultStringBuilder.append(it)
            }
        }
        return resultStringBuilder.toString()
    }
}