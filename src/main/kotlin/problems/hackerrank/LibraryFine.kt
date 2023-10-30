package problems.hackerrank

/*
*   HackerRank: Library Fine
*   https://www.hackerrank.com/challenges/library-fine/problem
*/

fun libraryFine(d1: Int, m1: Int, y1: Int, d2: Int, m2: Int, y2: Int): Int {
    if (y1 != y2) {
        if (y1 > y2) {
            return 10000
        } else {
            return 0
        }
    } else if (m1 != m2) {
        if (m1 > m2) {
            return (m1 - m2) * 500
        } else {
            return 0
        }
    } else {
        if (d1 > d2) {
            return (d1 - d2) * 15
        } else {
            return 0
        }
    }
}