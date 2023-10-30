package problems.hackerrank

/*
*   HackerRank: Game of Thrones - I
*   https://www.hackerrank.com/challenges/game-of-thrones/problem
*/

fun gameOfThrones(s: String): String {
    val charMap = mutableMapOf<Char, Int>()
    s.forEach {
        charMap[it] = charMap.getOrDefault(it, 0) + 1
    }

    if (s.length % 2 == 0) {
        for ((key,value) in charMap.entries) {
            if (value % 2 != 0) {
                return "NO"
            }
        }
        return "YES"
    } else {
        var isEvenCountFound = false
        for ((key,value) in charMap.entries) {
            if (value % 2 != 0){
                if (isEvenCountFound) {
                    return "NO"
                } else {
                    isEvenCountFound = true
                }
            }
        }
        return "YES"
    }
}