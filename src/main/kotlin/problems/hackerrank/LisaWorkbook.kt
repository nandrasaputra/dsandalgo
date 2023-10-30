package problems.hackerrank

/*
*   HackerRank: Lisa Workbook
*   https://www.hackerrank.com/challenges/lisa-workbook/problem
*/

fun workbook(n: Int, k: Int, arr: Array<Int>): Int {
    var numberOfSpecialProblem = 0
    var currentPage = 1
    for (chapter in 1..n) {
        var problemCounter = 1
        val numberOfProblem = arr[chapter-1]
        val numberOfPage = Math.ceil(numberOfProblem.toDouble()/k).toInt()
        for (page in currentPage until currentPage+numberOfPage) {
            val bottomBound = 1 + (k * (problemCounter-1))
            val upperBoundCalculation = problemCounter * k
            val upperBound = if (upperBoundCalculation > numberOfProblem) {
                numberOfProblem
            } else {
                upperBoundCalculation
            }
            val pageRange = (bottomBound..upperBound)
            if (pageRange.contains(page)) {
                numberOfSpecialProblem++
            }
            problemCounter++
        }
        currentPage += numberOfPage
    }
    return numberOfSpecialProblem
}