package problems.leetcode

import java.util.Stack

object ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for (char in s) {
            if (isOpenBracket(char)) {
                stack.push(char)
            } else {
                val lastStackItem = try {
                    stack.peek()
                } catch (exception: Exception) {
                    null
                }
                if (lastStackItem == null || lastStackItem != getOpeningBracket(char)) {
                    return false
                } else {
                    stack.pop()
                }
            }
        }
        return stack.isEmpty()
    }

    private fun isOpenBracket(char: Char) : Boolean {
        return char == '{' || char == '[' || char == '('
    }

    private fun getOpeningBracket(char: Char) : Char {
        return when(char) {
            ')' -> '('
            '}' -> '{'
            else -> '['
        }
    }
}

fun main() {
    print(ValidParentheses.isValid("]"))
}