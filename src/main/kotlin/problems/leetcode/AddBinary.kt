package problems.leetcode

import kotlin.math.max

object AddBinary {
    fun addBinary(a: String, b: String): String {
        val resultString = StringBuilder()
        val aCharArr = a.toCharArray().reversedArray()
        val bCharArr = b.toCharArray().reversedArray()
        var hasCarry = false
        for (index in 0..max(aCharArr.size - 1, bCharArr.size - 1)) {
            val aValue = if (index < aCharArr.size) {
                aCharArr[index]
            } else {
                '0'
            }
            val bValue = if (index < bCharArr.size) {
                bCharArr[index]
            } else {
                '0'
            }
            var result = '0'
            if (aValue == '1' && bValue == '1') {
                result = '0'
                if (hasCarry) {
                    result = '1'
                } else {
                    hasCarry = true
                }
            } else if (aValue == '0' && bValue == '0') {
                result = '0'
                if (hasCarry) {
                    result = '1'
                    hasCarry = false
                }
            } else {
                result = '1'
                if (hasCarry) {
                    result = '0'
                }
            }
            resultString.append(result)
        }
        if (hasCarry) {
            resultString.append('1')
        }
        return resultString.reversed().toString()
    }
}

fun main() {
    println(AddBinary.addBinary("11", "1"))
}