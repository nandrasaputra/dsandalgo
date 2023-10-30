package problems.leetcode

/*
*   897. Increasing Order Search Tree
*   https://leetcode.com/problems/increasing-order-search-tree/
*/

object IncreasingOrderSearchTree {

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun increasingBST(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }

        val resultList = mutableListOf<Int>()

        bfs(root, resultList)

        val resultNode = TreeNode(0)

        insertNode(resultNode, resultList, 0)

        return resultNode.right
    }

    private fun insertNode(root: TreeNode, resultList: List<Int>, index: Int) {
        val value = resultList.getOrNull(index)
        if (value != null) {
            root.right = TreeNode(value)
            insertNode(root.right!!, resultList, index + 1)
        }
    }

    private fun bfs(node: TreeNode?, resultList: MutableList<Int>) {
        if (node == null) {
            return
        }
        bfs(node.left, resultList)
        resultList.add(node.`val`)
        bfs(node.right, resultList)
    }

}
