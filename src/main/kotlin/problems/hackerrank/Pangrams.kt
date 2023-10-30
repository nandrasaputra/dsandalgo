package problems.hackerrank

/*
*   HackerRank: Pangrams
*   https://www.hackerrank.com/challenges/pangrams/problem
*/

fun pangrams(s: String): String {
    val baseIndex = 'a'.toInt()
    val charArray = IntArray(26) {0}
    s.replace("\\s".toRegex(), "").toLowerCase().toCharArray().forEach {
        charArray[it.toInt() - baseIndex]++
    }
    if (charArray.none { it == 0 }) {
        return "pangram"
    } else {
        return "not pangram"
    }
}