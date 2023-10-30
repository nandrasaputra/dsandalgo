package problems.hackerrank

/*
*   HackerRank: Beautiful Days at The Movies
*   https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
*/

fun beautifulDays(i: Int, j: Int, k: Int): Int {
    var result = 0
    for (day in i..j) {
        if (Math.abs(day - reverseNumber(day)) % k == 0) {
            result++
        }
    }
    return result
}

private fun reverseNumber(number: Int) : Int {
    var result = 0
    var remainder = number
    while (remainder != 0) {
        result = result * 10 + remainder % 10
        remainder /= 10
    }
    return result
}