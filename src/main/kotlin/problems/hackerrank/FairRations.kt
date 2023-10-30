package problems.hackerrank

/*
*   HackerRank: Fair Rations
*   https://www.hackerrank.com/challenges/fair-rations/problem
*/

fun fairRations(B: Array<Int>): Int {
    var breadUsed = 0
    for (index in B.indices) {
        if (B[index] % 2 != 0) {
            if (index + 1 < B.size) {
                B[index + 1] += 1
                breadUsed += 2
            } else {
                print("NO")
            }
        }
    }
    return breadUsed
}