package problems.leetcode

/*
*   leetcode: 832. Flipping an Image
*   https://leetcode.com/problems/flipping-an-image/
*/

object FlipAndInvertImage {
    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
        val resultArray = Array<IntArray>(image.size) { intArrayOf()}
        for ((imageIndex, imageArray) in image.withIndex()) {
            val subResult = IntArray(imageArray.size) {0}
            var leftIndex = 0
            for (rightIndex in imageArray.size-1 downTo 0) {
                if (imageArray[rightIndex] == 1) {
                    subResult[leftIndex] = 0
                } else {
                    subResult[leftIndex] = 1
                }
                leftIndex++
            }
            resultArray[imageIndex] = subResult
        }
        return resultArray
    }
}