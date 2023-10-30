package problems.hackerrank

/*
*   HackerRank: Hurdle Race
*   https://www.hackerrank.com/challenges/the-hurdle-race/problem
*/
fun hurdleRace(k: Int, height: Array<Int>): Int {
    val hurdleMaxHeight = height.maxOrNull() ?: 0
    if (k >= hurdleMaxHeight) {
        return 0
    } else {
        return hurdleMaxHeight - k
    }
}