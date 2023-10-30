package problems.leetcode

import java.util.*

/*
*       LeetCode Problem : MergeTwoBinaryTree
*       https://leetcode.com/problems/merge-two-binary-trees/
* */

object MergeTwoBinaryTree {
    /**
     * Example:
     * var ti = TreeNode(5)
     * var v = ti.`val`
     * Definition for a binary tree node.
     * class TreeNode(var `val`: Int) {
     *     var left: TreeNode? = null
     *     var right: TreeNode? = null
     * }
     */

    class TreeNode(var `val`: Int) {
            var left: TreeNode? = null
            var right: TreeNode? = null
        }
    class Solution {
        fun mergeTrees(t1: TreeNode?, t2: TreeNode?): TreeNode? {
            return mergeNode(t1, t2)
        }

        private fun mergeNode(t1: TreeNode?, t2: TreeNode?) : TreeNode? {
            return if (t1 != null && t2 != null) {
                val nodeValueSum = t1.`val` + t2.`val`
                val newNode = TreeNode(nodeValueSum)
                newNode.left = mergeNode(t1.left, t2.left)
                newNode.right = mergeNode(t1.right, t2.right)
                return newNode
            } else if (t1 != null && t2 == null) {
                t1
            } else if (t1 == null && t2 != null) {
                t2
            } else {
                null
            }
        }
     }
}