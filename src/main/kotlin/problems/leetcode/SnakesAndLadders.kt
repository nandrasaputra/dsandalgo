package problems.leetcode

import java.util.*
import kotlin.math.floor

object SnakesAndLadders {
    fun snakesAndLadders(board: Array<IntArray>): Int {
        val reversedBoard = board.reversed().toTypedArray()

        // BoardNumber, Moves
        val queue: Queue<Pair<Int, Int>> = LinkedList()

        queue.add(Pair(1, 0))

        val history = mutableSetOf<Int>()

        while (queue.isNotEmpty()) {
            val currentSquare = queue.poll()

            for (move in 1..6) {
                var nextBoardNumber = currentSquare.first + move
                val (column, row) = getRowAndCol(reversedBoard, nextBoardNumber)
                if (reversedBoard[column][row] != -1) {
                    nextBoardNumber = reversedBoard[column][row]
                }
                if (nextBoardNumber == reversedBoard.size * reversedBoard.size) {
                    return currentSquare.second + 1
                }
                if (nextBoardNumber > board.size * board.size) continue
                if (!history.contains(nextBoardNumber)) {
                    history.add(nextBoardNumber)
                    queue.add(Pair(nextBoardNumber, currentSquare.second + 1))
                }
            }
        }
        // Column = board.size - (ceil(boardNumber / board.size) - 1)

        // if column % 2 == 0
        // row = (boardNumber % board.size) - 1

        // else
        // row = boardNumber % board.size
        return -1
    }

    private fun getRowAndCol(board: Array<IntArray>, boardNumber: Int): Pair<Int, Int> {
        val n = board.size
        val column = floor((boardNumber.toDouble() - 1) / n).toInt()
        val row = if (column % 2 == 0) {
            (boardNumber - 1) % n
        } else {
            (n - 1) - ((boardNumber - 1) % n)
        }
        return Pair(column, row)
    }
}