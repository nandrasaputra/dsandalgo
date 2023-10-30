package problems.leetcode

/*
*   leetcode: 942. DI String Match
*   https://leetcode.com/problems/di-string-match/
*/

object DIStringMatch {
    fun diStringMatch(s: String): IntArray {
        var dIndex = s.length
        var iIndex = 0
        val result = IntArray(s.length + 1) {0}

        for (index in s.indices) {
            if (s[index] == 'D') {
                result[index] = dIndex
                dIndex--
            } else {
                result[index] = iIndex
                iIndex++
            }
        }

        val dCount = s.length - dIndex
        val iCount = iIndex

        if (dCount != 0 || iCount != 0) {
            result[s.length] = (dIndex + 1 + dIndex - 1) / 2
        } else if (dCount == 0) {
            result[s.length] = s.length
        } else {
            result[s.length] = 0
        }

        return result
    }
}