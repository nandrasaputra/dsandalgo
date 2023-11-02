package problems.leetcode

import kotlin.math.max

class MaxDepthOfBinTree {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    class Solution {
        fun maxDepth(root: TreeNode?): Int {
            return if (root == null) 0 else visitNode(1, root)
        }

        private fun visitNode(currentLevel: Int, node: TreeNode) : Int {
            return if (node.left == null && node.right == null) {
                currentLevel
            } else {
                val left = node.left?.let { visitNode(currentLevel + 1, it) } ?: currentLevel
                val right = node.right?.let { visitNode(currentLevel + 1, it) } ?: currentLevel
                max(left, right)
            }
        }
    }
}