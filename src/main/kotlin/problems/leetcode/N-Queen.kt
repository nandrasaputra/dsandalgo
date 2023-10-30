package problems.leetcode

/*
*   Leetcode: 51. N-Queens
*   https://leetcode.com/problems/n-queens/
*/

object NQueen {
    fun solveNQueens(n: Int): List<List<String>> {
        val resultList = mutableListOf<Array<Array<String>>>()
        val initialBoard = Array(n) {Array(n) {"."} }
        findQueenForRow(0, n, initialBoard, resultList)
        return resultList.map { outerArray ->
            outerArray.map { arrayOfString ->
                arrayOfString.joinToString("")
            }
        }
    }

    private fun findQueenForRow(row: Int, boardSize: Int, currentBoard: Array<Array<String>>, resultList: MutableList<Array<Array<String>>>) {
        if (row >= boardSize) {
            val result = Array(boardSize) { Array(boardSize) {""} }
            for (_row in currentBoard.indices) {
                for (_column in currentBoard[_row].indices) {
                    result[_row][_column] = currentBoard[_row][_column]
                }
            }
            resultList.add(result)
            return
        } else {
            for (column in 0 until boardSize) {
                currentBoard[row][column] = "Q"
                if (isPositionValid(row, column, currentBoard)) {
                    findQueenForRow(row+1, boardSize, currentBoard, resultList)
                    currentBoard[row][column] = "."
                } else {
                    currentBoard[row][column] = "."
                }
            }
        }
    }

    private fun isPositionValid(row: Int, column: Int, currentBoard: Array<Array<String>>) : Boolean {
        // check top
        for (lookUpRow in 0 until row) {
            if (currentBoard[lookUpRow][column] == "Q") {
                return false
            }
        }

        // check left top
        var jRow = row-1
        var jCol = column-1
        while (jRow >= 0 && jCol >=0) {
            val nextTopLeftPosition = currentBoard[jRow][jCol]
            if (nextTopLeftPosition == "Q") {
                return false
            }
            jCol--
            jRow--
        }

        // Check TopRight Diagonal
        var kRow = row-1
        var kCol = column+1
        while (kRow >= 0 && kCol < currentBoard[row].size) {
            val nextTopRightPosition = currentBoard[kRow][kCol]
            if (nextTopRightPosition == "Q") {
                return false
            }
            kRow--
            kCol++
        }

        return true
    }
}

/*
fun main() {
    NQueen.solveNQueens(4).forEach {
        println("----")
        it.forEach {
            println(it)
        }
        println("----")
    }
}*/
