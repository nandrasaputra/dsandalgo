package problems.hackerrank

/*
*   HackerRank: Alternating Characters
*   https://www.hackerrank.com/challenges/alternating-characters/problem
*/

fun alternatingCharacters(s: String): Int {
    var counter = 0
    for(index in 0 until s.length - 1) {
        if (s[index] == s[index+1]) {
           counter++
        }
    }
    return counter
}
