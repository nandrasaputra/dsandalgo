// Longest Common Subsequence
// LCS of aabcccd and aabcccdd would be 3 (three c)
fun findLCS(stringOne: String, stringTwo: String) : Int {
    val m = stringOne.length
    val n = stringTwo.length
    val intermediateValue = Array(m+1) { Array<Int?>(n+1) {null} }
    return LCS(stringOne, stringTwo, m, n, intermediateValue)
}

private fun LCS(input1: String, input2: String, m: Int, n: Int, table: Array<Array<Int?>>): Int {
    table[m][n]?.let {
        return it
    }
    val result = if (m == 0 || n == 0) {
        //Base Case
        0
    } else if (input1[m-1] == input2[n-1]) {
        1 + LCS(input1, input2, m-1, n-1, table)
    } else {
        Math.max(
            LCS(input1, input2, m, n-1, table),
            LCS(input1, input2, m-1, n, table)
        )
    }
    table[m][n] = result
    return result
}
