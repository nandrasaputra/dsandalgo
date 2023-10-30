package datastructure

class MyStack<T> {

    var head: MyStackNode<T>? = null

    fun pop() : T? {
        if (head == null) {
            return null
        } else {
            if (head?.nextNode != null) {
                val currentHead = head
                head = head?.nextNode
                return currentHead?.nodeValue
            } else {
                val currentHead = head
                head = null
                return currentHead?.nodeValue
            }
        }
    }

    fun push(item: T) {
        head = if (head != null) {
            val newNode = MyStackNode(head, item)
            newNode
        } else {
            MyStackNode(null, item)
        }
    }

    fun peek(): T? {
        return head?.nodeValue
    }

    fun isEmpty(): Boolean {
        return head == null
    }
}

class MyStackNode<T> (
    var nextNode : MyStackNode<T>? = null,
    var nodeValue: T? = null
)