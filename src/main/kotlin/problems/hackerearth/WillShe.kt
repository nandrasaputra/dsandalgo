package problems.hackerearth

/*
*   HackerEarth: Will she accept him?
*   https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/will-she-accept-him/
*/

fun willSheAccept(s1: String, s2: String) : String{
    var currentS1CharIndex = 0
    var isSubsequence = false
    for (s2Char in s2) {
        if (s2Char == s1[currentS1CharIndex]) {
            currentS1CharIndex++
        }
        if (currentS1CharIndex == s1.length) {
            isSubsequence = true
            break
        }
    }

    return if (isSubsequence) {
        "Love you too"
    } else {
        "We are only friends"
    }
}

/*
fun main() {
    val T = readLine()!!.toInt()
    val stringArray = Array(T) {""}
    for (index in 0 until T) {
        stringArray[index] = readLine()!!
    }
    stringArray.forEach {
        val splitString = it.split(" ")
        println(willSheAccept(splitString[0], splitString[1]))
    }
}*/
