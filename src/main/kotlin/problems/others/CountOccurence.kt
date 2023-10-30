package problems.others

import java.lang.StringBuilder

fun main() {
    val testCases = readLine()!!.toInt()
    val resultList = mutableListOf<String>()
    (1..testCases).forEach {
        val S = readLine()!!
        val occurenceMap = mutableMapOf<Char, Int>()
        val alphabetSet = mutableSetOf<Char>()
        S.forEach {
            occurenceMap[it] = occurenceMap.getOrDefault(it, 0) + 1
        }
        val stringBuilder = StringBuilder()
        S.forEach {
            if (!alphabetSet.contains(it)) {
                stringBuilder.append(it)
                stringBuilder.append(occurenceMap[it])
                alphabetSet.add(it)
            }
        }
        resultList.add(stringBuilder.toString())
    }

    resultList.forEach {
        println(it)
    }
}