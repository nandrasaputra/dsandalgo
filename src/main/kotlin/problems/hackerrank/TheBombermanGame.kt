package problems.hackerrank

import java.lang.StringBuilder

/*
*   HackerRank: The Bomberman Game
*   https://www.hackerrank.com/challenges/bomber-man/problem
*   illustration: https://github.com/nandrasaputra/DataStructureAndAlgorithm/blob/main/utils/bomberman_illustration.png
*/

fun bomberMan(n: Int, grid: Array<String>): Array<String> {

    // CASE N == 1
    if (n == 1) {
        return grid
    }

    val twoHundredORepeated = "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO"
    val bombString: String = twoHundredORepeated.substring(grid[0].indices)
    val allBombStringArray = Array<String>(grid.size) { "" }
    for (index in grid.indices) {
        allBombStringArray[index] = bombString
    }

    // CASE N % 2 == 0
    if (n % 2 == 0) {
        return allBombStringArray
    }

    val cycle = (n - 3) % 4
    val cycleZeroResult = explodeBomb(grid, bombString)

    if (cycle == 0) {
        return cycleZeroResult
    }

    return explodeBomb(cycleZeroResult, bombString)
}

private fun explodeBomb(input: Array<String>, bombString: String): Array<String> {
    val resultStringBuilderArray = Array<StringBuilder>(input.size) {StringBuilder(bombString)}
    for (a in input.indices) {
        for (b in input[0].indices) {
            if (input[a][b] == 'O') {
                resultStringBuilderArray[a][b] = '.'
                val coordinateList = listOf((-1 to 0), (0 to -1), (0 to 1), (1 to 0))
                coordinateList.forEach { currentCoordinatePair ->
                    try {
                        resultStringBuilderArray[a + currentCoordinatePair.first][b + currentCoordinatePair.second] = '.'
                    } catch (exception: Exception) {

                    }
                }
            }
        }
    }
    val resultStringArray = Array<String>(input.size) {""}
    for ((index, stringBuilder) in resultStringBuilderArray.withIndex()) {
        resultStringArray[index] = stringBuilder.toString()
    }
    return resultStringArray
}