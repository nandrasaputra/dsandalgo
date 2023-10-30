package problems.hackerearth

/*
*   HackerEarth: Monk and Inversions
*   https://www.hackerearth.com/practice/codemonk/
*/

fun getNumberOfInversion(array: Array<Array<Int>>) : Int {
    var numberOfInversion = 0
    val arraySize = array.size
    for (i in array.indices) {
        for (j in array[i].indices) {
            for (p in i until arraySize) {
                for (q in j until  arraySize) {
                    if (array[i][j] > array[p][q]) {
                        numberOfInversion++
                    }
                }
            }
        }
    }
    return numberOfInversion
}

/*
fun main() {
    val numberOfTestCases = readLine()!!.toInt()
    val resultList = mutableListOf<Int>()
    (1..numberOfTestCases).forEach { _ ->
        val matrixSize = readLine()!!.toInt()
        val matrix = Array(matrixSize) { Array(matrixSize) {0} }
        for (index in 0 until matrixSize) {
            matrix[index] = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
        }
        resultList.add(getNumberOfInversion(matrix))
    }
    resultList.forEach { result ->
        println(result)
    }
}*/
