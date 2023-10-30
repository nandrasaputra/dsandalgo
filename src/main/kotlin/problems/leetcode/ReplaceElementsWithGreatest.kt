package problems.leetcode

/*
*   1299. Replace Elements with Greatest Element on Right Side
*   https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
*/

object ReplaceElementsWithGreatest {
    fun replaceElements(arr: IntArray): IntArray {
        var rightMaxValue = -1
        val result = IntArray(arr.size) { 0 }
        for (index in arr.size - 1 downTo 0) {
            val currentValue = arr[index]
            result[index] = rightMaxValue
            rightMaxValue = Math.max(currentValue, rightMaxValue)

        }
        return result
    }
}