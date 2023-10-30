package problems.hackerrank

/*
*   HackerRank: Two Strings
*   https://www.hackerrank.com/challenges/two-strings/problem
*/

fun twoStrings(s1: String, s2: String): String {
    val firstCharMap = mutableMapOf<Char, Int>()
    s1.forEach {
        firstCharMap[it] = firstCharMap.getOrDefault(it, 0) + 1
    }
    s2.forEach {
        if (firstCharMap.getOrDefault(it, 0) > 0) {
            return "YES"
        }
    }
    return "NO"
}