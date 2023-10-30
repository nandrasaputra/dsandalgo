package problems.leetcode

/*
*   leetcode: 1047. Remove All Adjacent Duplicates In String
*   https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
*/

import java.util.*

object RemoveAllAdjacentDuplicate {
    fun removeDuplicates(s: String): String {
        val charStack: Stack<Char> = Stack()
        s.forEach { currentChar ->
            val previousChar = if (charStack.isNotEmpty()) {
                charStack.peek()
            } else {
                null
            }
            if (previousChar != null) {
                if (previousChar == currentChar) {
                    charStack.pop()
                } else {
                    charStack.add(currentChar)
                }
            } else {
                charStack.add(currentChar)
            }
        }
        return charStack.joinToString("")
    }
}

fun main() {
    print(RemoveAllAdjacentDuplicate.removeDuplicates("abbaca"))
}