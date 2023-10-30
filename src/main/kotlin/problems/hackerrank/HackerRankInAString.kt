package problems.hackerrank

import java.util.*

/*
*   HackerRank: HackerRank In a String
*   https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem
*/

fun hackerrankInString(s: String): String {
    val charQueue: Queue<Char> = LinkedList()
    charQueue.addAll("hackerrank".toCharArray().toList())
    var currentChar = charQueue.remove()
    s.toCharArray().forEach { char ->
        if (charQueue.isEmpty()) {
            return "YES"
        }
        if (char == currentChar) {
            currentChar = charQueue.remove()
        }
    }
    if (charQueue.isEmpty()) {
        return "YES"
    }
    return "NO"
}