package problems.leetcode

object LetterCombPhoneNumber {
    fun letterCombinations(digits: String): List<String> {
        val result = mutableListOf<String>()
        if (digits.isNotEmpty()) {
            backtrack(digits, 0, "", result)
        }
        return result
    }

    private fun backtrack(digits: String, i: Int, currWord: String, result: MutableList<String>) {
        val digitToWordMap = mapOf(Pair('2', "abc"), Pair('3', "def"), Pair('4', "ghi"), Pair('5', "jkl"), Pair('6', "mno"), Pair('7', "pqrs"), Pair('8', "tuv"), Pair('9', "wxyz"))
        if (currWord.length == digits.length) {
            result.add(currWord)
            return
        }
        val digit = digits[i]
        val word: String = digitToWordMap[digit]!!
        for (c in word) {
            backtrack(digits, i+1, currWord + c, result)
        }
    }
}