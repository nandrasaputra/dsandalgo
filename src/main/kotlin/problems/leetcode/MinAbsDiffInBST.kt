package problems.leetcode

import kotlin.math.min

// https://leetcode.com/problems/minimum-absolute-difference-in-bst/?envType=study-plan-v2&envId=top-interview-150

object MinAbsDiffInBST {
    private var prevValue: Int? = null
    private var currentMinDiff: Int? = null

    fun getMinimumDifference(root: TreeNode?): Int {
        if (root == null) return 0
        transverseTree(root)
        return currentMinDiff ?: 0
    }

    private fun transverseTree(node: TreeNode?) {
        if (node == null) return
        node.left?.let { transverseTree(it) }
        if (prevValue != null) {
            val newDiff = Math.abs(node.`val` - prevValue!!)
            if (currentMinDiff != null) {
                currentMinDiff = min(currentMinDiff!!, newDiff)
            } else {
                currentMinDiff = newDiff
            }
            prevValue = node.`val`
        } else {
            prevValue = node.`val`
        }
        node.right?.let { transverseTree(it) }
    }
}