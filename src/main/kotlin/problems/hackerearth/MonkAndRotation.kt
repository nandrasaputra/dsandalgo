package problems.hackerearth

/*
*   HackerEarth: Monk and Rotation
*   https://www.hackerearth.com/practice/codemonk/
*/

fun rotateArray(array: Array<Int>, rotation: Int) : Array<Int> {
    val arrayLength = array.size
    val result = Array(array.size) {0}

    for ((arrayIndex, arrayValue) in array.withIndex()) {
        val resultIndex = (arrayIndex + rotation) % (arrayLength)
        result[resultIndex] = arrayValue
    }

    return result
}

/*
fun main () {
    val testCase = readLine()!!.toInt()
    val allResult = mutableListOf<Array<Int>>()
    (1..testCase).forEach {
        val (arrayLength, rotation) = readLine()!!.split(" ")
        val array = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
        allResult.add(rotateArray(array, rotation.toInt()))
    }
    allResult.forEach {
        println(it.joinToString(" "))
    }
}*/
