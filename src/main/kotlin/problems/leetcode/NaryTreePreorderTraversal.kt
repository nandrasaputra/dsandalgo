package problems.leetcode

/*
*   589. N-ary Tree Preorder Traversal
*   https://leetcode.com/problems/n-ary-tree-preorder-traversal/
*/

import java.util.*

object NaryTreePreorderTraversal {

     class Node(var `val`: Int) {
        var children: List<Node?> = listOf()
     }

    fun preorder(root: Node?): List<Int> {
        val result = mutableListOf<Int>()
        dfsPreOrder(root, result)
        return result
    }

    private fun dfsPreOrder(root: Node?, resultList: MutableList<Int>) {
        if (root == null) {
            return
        }

        resultList.add(root.`val`)

        val childQueue: Queue<Node?> = LinkedList()
        root.children.forEach {
            childQueue.add(it)
        }

        while (childQueue.isNotEmpty()) {
            val currentChild = childQueue.poll()
            dfsPreOrder(currentChild, resultList)
        }
    }
}

fun main() {
    val root = NaryTreePreorderTraversal.Node(1).apply {
        children = listOf(
            NaryTreePreorderTraversal.Node(3).apply {
                children = listOf(
                    NaryTreePreorderTraversal.Node(5),
                    NaryTreePreorderTraversal.Node(6)
                )
            },
            NaryTreePreorderTraversal.Node(2),
            NaryTreePreorderTraversal.Node(4)
        )
    }
    print(NaryTreePreorderTraversal.preorder(root).joinToString(","))
}