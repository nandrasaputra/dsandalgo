package problems.leetcode

// Not Optimized
// https://leetcode.com/problems/valid-sudoku/submissions/1088710099/?envType=study-plan-v2&envId=top-interview-150
object ValidSudoku {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        if (hasDuplicateValueInHorizontal(board)) return false
        if (hasDuplicateValueInVertical(board)) return false
        if (ifHasDuplicateValueInBox(board)) return false
        return true
    }

    private fun hasDuplicateValueInHorizontal(board: Array<CharArray>) : Boolean {
        for (item in board) {
            val hasDuplicateValue = item.filter { it != '.' }.groupBy { it }.any { it.value.size > 1 }
            if (hasDuplicateValue) {
                return true
            }
        }
        return false
    }

    private fun hasDuplicateValueInVertical(board: Array<CharArray>) : Boolean {
        for (index in board.first().indices) {
            val charSet = mutableSetOf<Char>()
            for (item in board) {
                val charItem = item[index]
                if (charItem != '.') {
                    if (charSet.contains(charItem)) {
                        return true
                    } else {
                        charSet.add(charItem)
                    }
                }
            }
        }
        return false
    }

    private fun ifHasDuplicateValueInBox(board: Array<CharArray>) : Boolean {
        for (horizontalBoxIndex in 0..2) {
            for (verticalBoxIndex in 0..2) {
                val horizontalStartIndex = horizontalBoxIndex * 3
                val horizontalEndIndex = horizontalStartIndex + 2
                val verticalStartIndex = verticalBoxIndex * 3
                val verticalEndIndex = verticalStartIndex + 2

                val valueSet = mutableSetOf<Char>()

                for (horizontal in horizontalStartIndex..horizontalEndIndex) {
                    for (vertical in verticalStartIndex..verticalEndIndex) {
                        val value = board[vertical][horizontal]
                        if (value != '.') {
                            if (valueSet.contains(value)) {
                                return true
                            } else {
                                valueSet.add(value)
                            }
                        }
                    }
                }
            }
        }
        return false
    }
}

fun main() {
    val inputArray = arrayOf(
        charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
    )
    println(ValidSudoku.isValidSudoku(inputArray))
}