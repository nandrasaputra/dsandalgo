package problems.others

fun main() {
    val testCase = readLine()!!.toInt()
    val resultList = mutableListOf<String>()

    (1..testCase).forEach {
        val numberMap = mutableMapOf<Int, Int>()
        val N = readLine()!!.toInt()
        val numberList = readLine()!!.split(" ").map { it.toInt() }
        numberList.forEach {
            numberMap[it] = numberMap.getOrDefault(it, 0) + 1
        }
        var result = "YES"
        for (mapEntry in numberMap) {
            if (mapEntry.value % 2 != 0) {
                result = "NO"
                break
            }
        }
        resultList.add(result)
    }

    resultList.forEach {
        println(it)
    }
}