package problems.leetcode

/*
*   leetcode: 590. N-ary Tree Postorder Traversal
*   https://leetcode.com/problems/n-ary-tree-postorder-traversal/
*/

import java.util.*

object NaryTreePostorderTraversal {

    class Node(var `val`: Int) {
        var children: List<Node?> = listOf()
    }

    fun postorder(root: Node?): List<Int> {
        val resultList = mutableListOf<Int>()
        dfsPostOrder(root, resultList)
        return resultList
    }

    private fun dfsPostOrder(root: Node?, resultList: MutableList<Int>) {
        if (root == null) {
            return
        }

        val childQueue: Queue<Node?> = LinkedList()
        root.children.forEach {
            childQueue.add(it)
        }

        while (childQueue.isNotEmpty()) {
            val currentChild = childQueue.poll()
            dfsPostOrder(currentChild, resultList)
        }

        resultList.add(root.`val`)
    }
}