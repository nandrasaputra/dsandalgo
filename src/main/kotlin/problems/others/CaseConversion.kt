package problems.others

import java.lang.StringBuilder

fun main() {
    val testCase = readLine()!!.toInt()
    val resultList = mutableListOf<String>()
    (1..testCase).forEach {
        val result = StringBuilder()
        val input = readLine()!!
        input.forEach {
            if (it.isUpperCase()) {
                result.append("_")
                result.append(it.toLowerCase())
            } else {
                result.append(it)
            }
        }
        if (result[0] == '_') {
            result.deleteCharAt(0)
        }
        resultList.add(result.toString())
    }

    resultList.forEach {
        println(it)
    }
}