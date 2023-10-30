package problems.leetcode

/*
*   leetcode: 1704. Determine if String Halves Are Alike
*   https://leetcode.com/problems/determine-if-string-halves-are-alike/
*/

object HalvesAreAlike {
    fun halvesAreAlike(s: String): Boolean {
        val regex = Regex("[aiueoAIUEO]+")
        val a = s.substring(0 until (s.length/2))
        val b = s.substring((s.length/2) until s.length)
        var aResult = 0
        var bResult = 0
        for(char in a) {
            if (regex.matches(char.toString())) {
                aResult++
            }
        }
        for(char in b) {
            if (regex.matches(char.toString())) {
                bResult++
            }
        }
        return aResult == bResult
    }
}