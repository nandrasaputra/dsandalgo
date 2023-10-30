package problems.leetcode

/*
*   Leetcode: 235. Lowest Common Ancestor of a Binary Search Tree
*   https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
*/

object LowestCommonAncestorBST {
    /**
     * Definition for a binary tree node.
     * class TreeNode(var `val`: Int = 0) {
     *     var left: TreeNode? = null
     *     var right: TreeNode? = null
     * }
     */

    class TreeNode(var `val`: Int = 0) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        return findAncestor(root, p, q)
    }

   private fun findAncestor(ancestor: TreeNode?, p: TreeNode?, q: TreeNode?) : TreeNode? {

        if(ancestor == null || p == null || q == null) {
            return null
        } else {
            if (p.`val` < ancestor.`val` && q.`val` < ancestor.`val`) {
                return findAncestor(ancestor.left, q, p)
            } else if (p.`val` > ancestor.`val` && q.`val` > ancestor.`val`) {
                return findAncestor(ancestor.right, p, q)
            } else {
                return ancestor
            }
        }
    }
}