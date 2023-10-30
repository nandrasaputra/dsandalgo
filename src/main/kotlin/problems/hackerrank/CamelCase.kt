package problems.hackerrank

/*
*   HackerRank: Camel Case
*   https://www.hackerrank.com/challenges/camelcase/problem
*/

fun camelcase(s: String): Int {
    return s.split(Regex("[A-Z]"), 0).size
}