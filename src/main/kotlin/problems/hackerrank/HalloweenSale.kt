package problems.hackerrank
/*
*   HackerRank: Halloween Sale
*   https://www.hackerrank.com/challenges/halloween-sale/problem
*/

fun howManyGames(p: Int, d: Int, m: Int, s: Int): Int {
    var count = 0
    var mS = s
    var mP = p
    while(mS >= mP){
        count++
        mS -= mP
        mP = Math.max(mP-d,m)
    }
    return count
}