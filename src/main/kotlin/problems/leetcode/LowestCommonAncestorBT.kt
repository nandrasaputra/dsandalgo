package problems.leetcode

/*
*   leetcode: 236. Lowest Common Ancestor of a Binary Tree
*   https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
*/

object LowestCommonAncestorBT {
     class TreeNode(var `val`: Int = 0) {
        var left: TreeNode? = null
        var right: TreeNode? = null
     }

    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        val pPathList = mutableListOf<TreeNode>()
        val qPathList = mutableListOf<TreeNode>()

        if (p == null || q == null) {
            return null
        }

        findPath(p, root, pPathList)
        findPath(q, root, qPathList)

        if (pPathList.isEmpty() || qPathList.isEmpty()) {
            return null
        }

        var currentAncestor: TreeNode? = null
        for (index in 0 until (Math.min(pPathList.size, qPathList.size))) {
            if (pPathList[index].`val` != qPathList[index].`val`) {
                break
            }
            currentAncestor = pPathList[index]
        }

        return currentAncestor
    }


    private fun findPath(target: TreeNode, root: TreeNode?, result: MutableList<TreeNode>) : Boolean {

        if (root == null) {
            return false
        }

        result.add(root)

        if (root.`val` == target.`val`) {
            return true
        }

        if (root.left != null && findPath(target, root.left, result)) {
            return true
        }

        if (root.right != null && findPath(target, root.right, result)) {
            return true
        }

        result.removeAt(result.size -1)

        return false
    }

}