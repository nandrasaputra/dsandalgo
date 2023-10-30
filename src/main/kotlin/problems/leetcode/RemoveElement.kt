package problems.leetcode

object RemoveElement {

    //https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var frontPointer = 0
        var backPointer = nums.size - 1
        var k = 0
        while (frontPointer <= backPointer) {
            val frontValue = nums[frontPointer]
            val backValue = nums[backPointer]
            if (frontValue == `val`) {
                if (backValue == `val`) {
                    backPointer--
                } else {
                    k++
                    nums[frontPointer] = backValue
                    nums[backPointer] = frontValue
                    frontPointer++
                    backPointer--
                }
            } else {
                k++
                frontPointer++
            }
        }
        return k
    }
}