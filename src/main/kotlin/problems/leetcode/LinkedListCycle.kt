package problems.leetcode

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

// https://leetcode.com/problems/linked-list-cycle/submissions/1089202317/?envType=study-plan-v2&envId=top-interview-150
object LinkedListCycle {
    fun hasCycle(head: ListNode?): Boolean {
        var fastPointer = head
        var slowPointer = head

        while (fastPointer?.next != null) {
            slowPointer = slowPointer?.next
            fastPointer = fastPointer.next?.next
            if (slowPointer == fastPointer) {
                return true
            }
        }

        return false
    }
}