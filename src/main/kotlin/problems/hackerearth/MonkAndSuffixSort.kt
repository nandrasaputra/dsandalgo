package problems.hackerearth

/*
*   Monk and Suffix Sort
*   https://www.hackerearth.com/practice/codemonk/
*/

fun main() {
    val input = readLine()!!.split(" ")
    val S = input[0]
    val k = input[1].toInt()

    val sufficesString = mutableListOf<String>()

    for (index in S.indices) {
        val numberToTake = S.length - index
        sufficesString.add(S.takeLast(numberToTake))
    }

    val sortedSufficeString = sufficesString.sorted()

    print(sortedSufficeString[k-1])
}
