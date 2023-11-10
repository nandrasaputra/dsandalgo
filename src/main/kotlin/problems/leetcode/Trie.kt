package problems.leetcode

data class TrieNode(
    val children: MutableMap<Char, TrieNode> = mutableMapOf(),
    var isEndOfTheWord: Boolean = false
)

object Trie {
    val root = TrieNode()
    fun insert(word: String) {
        var currentNode = root
        for (char in word) {
            if (currentNode.children[char] == null) {
                currentNode.children[char] = TrieNode()
            }
            currentNode = currentNode.children[char]!!
        }
        currentNode.isEndOfTheWord = true
    }

    fun search(word: String): Boolean {
        var currentNode = root

        for (char in word) {
            if (currentNode.children[char] == null) {
                return false
            }
            currentNode = currentNode.children[char]!!
        }

        return currentNode.isEndOfTheWord
    }

    fun startsWith(prefix: String): Boolean {
        var currentNode = root

        for (char in prefix) {
            if (currentNode.children[char] == null) {
                return false
            }
            currentNode = currentNode.children[char]!!
        }
        return true
    }
}