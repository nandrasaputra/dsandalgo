package problems.leetcode

object SortedArrayToBST {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        return helper(nums, 0, nums.size - 1)
    }

    private fun helper(nums: IntArray, leftPointer: Int, rightPointer: Int) : TreeNode? {
        if (leftPointer > rightPointer) {
            return null
        }

        val midPointer = (leftPointer + rightPointer) / 2
        val root = TreeNode(nums[midPointer])
        root.left = helper(nums, leftPointer, midPointer - 1)
        root.right = helper(nums, midPointer + 1, rightPointer)
        return root
    }
}