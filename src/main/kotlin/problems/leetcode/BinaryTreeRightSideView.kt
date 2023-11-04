package problems.leetcode

import java.util.LinkedList

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

// https://leetcode.com/problems/binary-tree-right-side-view/?envType=study-plan-v2&envId=top-interview-150
object BinaryTreeRightSideView {
    fun rightSideView(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        val queue = LinkedList<TreeNode>()
        root?.let { queue.add(it) }
        while (queue.isNotEmpty()) {
            var last = 0
            repeat(queue.size) {
                val current = queue.poll()

                last = current.`val`
                current?.left?.let { queue.add(it) }
                current?.right?.let { queue.add(it) }
            }
            result.add(last)
        }
        return result
    }
}