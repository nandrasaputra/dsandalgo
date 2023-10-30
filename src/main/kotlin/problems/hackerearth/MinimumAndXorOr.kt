package problems.hackerearth

/*
*   HackerEarth: Minimum And Xor Or
*   https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/minimum-and-xor-or-6a05bbd4/
*   Note: Partially Accepted
*/

fun main() {
    val testCases = readLine()!!.toInt()
    val resultList = mutableListOf<Int>()
    (1..testCases).forEach { _ ->
        val N = readLine()!!.toInt()
        val array = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

        val xorResultList = mutableListOf<Int>()

        for (i in array.indices) {
            for (j in i+1 until array.size) {
                val andResult = array[i] and array[j]
                val orResult = array[i] or array[j]
                xorResultList.add(andResult xor orResult)
            }
        }

        resultList.add(xorResultList.minOrNull() ?: 0)
    }

    resultList.forEach {
        println(it)
    }
}