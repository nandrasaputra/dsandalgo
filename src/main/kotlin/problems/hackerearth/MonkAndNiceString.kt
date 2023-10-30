package problems.hackerearth

/*
*   HackerEarth: Monk and Nice Strings
*   https://www.hackerearth.com/practice/codemonk/
*/

/*
fun main() {
    val resultList = mutableListOf<Int>()
    val N = readLine()!!.toInt()
    val inputMap = mutableListOf<Pair<String, Int>>()
    var currentIndex = 1
    (1..N).forEach {
        val alphabetInput = readLine()!!
        inputMap.add(Pair(alphabetInput, currentIndex))

        val resultMap = inputMap.filter { pair ->
            (pair.second < currentIndex) && (pair.first < alphabetInput)
        }

        resultList.add(resultMap.size)

        currentIndex++
    }

    resultList.forEach {
        println(it)
    }
}*/
