package problems.leetcode

object PalindromeNumber2 {
    fun isPalindrome(x: Int): Boolean {
        val xString = x.toString()
        var frontPointer = 0
        var endPointer = xString.length -1

        while (frontPointer < endPointer) {
            if (xString[frontPointer] != xString[endPointer]) {
                return false
            }
            frontPointer++
            endPointer++
        }

        return true
    }
}