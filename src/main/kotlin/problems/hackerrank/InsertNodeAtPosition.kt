package problems.hackerrank

import java.util.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
*   HackerRank Problem : Insert a node at a specific position in a linked list
*   https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=linked-lists
* */

class SinglyLinkedListNode(nodeData: Int) {
    public var data: Int
    public var next: SinglyLinkedListNode?

    init {
        data = nodeData
        next = null
    }
}

class SinglyLinkedList {
    public var head: SinglyLinkedListNode?
    public var tail: SinglyLinkedListNode?

    init {
        head = null
        tail = null
    }

    public fun insertNode(nodeData: Int) {
        var node = SinglyLinkedListNode(nodeData)

        if (head == null) {
            head = node
        } else {
            tail?.next = node
        }

        tail = node
    }

}

fun printSinglyLinkedList(head: SinglyLinkedListNode?, sep: String) {
    var node = head;

    while (node != null) {
        print(node?.data)
        node = node?.next

        if (node != null) {
            print(sep)
        }
    }
}

// Complete the insertNodeAtPosition function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     data: Int
 *     next: SinglyLinkedListNode
 * }
 *
 */
fun insertNodeAtPosition(llist: SinglyLinkedListNode?, data: Int, position: Int): SinglyLinkedListNode? {
    if (position == 0) { 	// Change the root node
        val newRootNode = SinglyLinkedListNode(data)
        newRootNode.next = llist
        return newRootNode
    } else {			// Didn’t change the root, just alter the node
        val alteredRoot = llist
        insertNode(alteredRoot , data, 0, position)
        return alteredRoot
    }
}

// Helper function
private fun insertNode(node: SinglyLinkedListNode?, data: Int, currentPosition: Int, targetPosition: Int) {
    node?.let { currentNode ->
        if (currentPosition + 1 == targetPosition) {	// base case
            val originalNext = currentNode.next
            currentNode.next = SinglyLinkedListNode(data)
            currentNode.next?.next = originalNext
        } else {
            insertNode(currentNode.next, data, currentPosition + 1, targetPosition)
        }
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val llistCount = scan.nextLine().trim().toInt()
    val llist = SinglyLinkedList()

    for (i in 0 until llistCount) {
        val llist_item = scan.nextLine().trim().toInt()
        llist.insertNode(llist_item)
    }

    val data = scan.nextLine().trim().toInt()

    val position = scan.nextLine().trim().toInt()

    val llist_head = insertNodeAtPosition(llist?.head, data, position)

    printSinglyLinkedList(llist_head, " ")
}