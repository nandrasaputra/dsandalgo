package problems.leetcode

/*
*   LeetCode: 1678. Goal Parser Interpretation
*   https://leetcode.com/problems/goal-parser-interpretation/
*/

import java.lang.StringBuilder

object GoalParser {
    fun interpret(command: String): String {
        val resultStringBuilder = StringBuilder()
        var currentCharIndex = 0
        while (currentCharIndex <= command.length-1) {
            if (command[currentCharIndex] == 'G') {
                resultStringBuilder.append("G")
                currentCharIndex += 1
            } else {
                if (command[currentCharIndex+1] == 'a') {
                    resultStringBuilder.append("al")
                    currentCharIndex += 4
                } else {
                    resultStringBuilder.append("o")
                    currentCharIndex += 2
                }
            }
        }
        return resultStringBuilder.toString()
    }
}