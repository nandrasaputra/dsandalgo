package problems

fun findAllPermutation(input: String): List<String> {
    val sample = input.toLowerCase()
    val listOfPermutation = mutableListOf<String>()
    findPermutation("", sample, listOfPermutation)
    return listOfPermutation.toList()
}

private fun findPermutation(prefix: String, suffix: String, listOfPermutation: MutableList<String>) {
    if (suffix.isEmpty()) {
        listOfPermutation.add(prefix)
        return
    }

    for (index in suffix.indices) {
        val textBeforeTarget = suffix.substring(0 until index)
        val textAfterTarget = if (index == suffix.length-1) {
            ""
        } else {
            suffix.substring((index + 1) until suffix.length)
        }

        val newSuffix = textBeforeTarget + textAfterTarget
        val newPrefix = prefix + suffix[index]
        findPermutation(newPrefix, newSuffix, listOfPermutation)
    }
}

fun main() {
    println(findAllPermutation("kucing"))
}