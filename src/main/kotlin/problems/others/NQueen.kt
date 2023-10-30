package problems.others

class NQueen(n: Int) {
    private val board = Array(n) { IntArray(n) {0} }

    // Print All Solution
    fun findAllNQueenSolution() {
        findNQueen(board, 0)
    }

    private fun printBoard(board: Array<IntArray>) {
        for(row in board.indices) {
            println(board[row].contentToString())
        }
        println("")
    }

    private fun findNQueen(board: Array<IntArray>, row: Int) : Boolean {
        if (row >= board.size) {
            printBoard(board)
            return true
        }

        for (col in board[row].indices) {
            board[row][col] = 1
            if (isQueenPositionValid(board, row, col)) {

                // If Solution Found
                if (findNQueen(board, row+1)) {
                    board[row][col] = 0
                    continue
                }
            }
            board[row][col] = 0
        }

        return false
    }

    private fun isQueenPositionValid(board: Array<IntArray>, row: Int, col: Int) : Boolean {
        // Check Top
        for (i in 0 until row) {
            if (board[i][col] == 1) {
                return false
            }
        }

        // Check TopLeft Diagonal
        var jRow = row -1
        var jCol = col -1
        while (jRow >= 0 && jCol >= 0) {
            val nextTopLeftPosition = board[jRow][jCol]
            if (nextTopLeftPosition == 1) {
                return false
            }
            jRow--
            jCol--
        }

        // Check TopRight Diagonal
        var kRow = row-1
        var kCol = col+1
        while (kRow >= 0 && kCol < board[row].size) {
            val nextTopRightPosition = board[kRow][kCol]
            if (nextTopRightPosition == 1) {
                return false
            }
            kRow--
            kCol++
        }

        return true
    }
}

fun main() {
    val nQueen = NQueen(4)
    nQueen.findAllNQueenSolution()
}