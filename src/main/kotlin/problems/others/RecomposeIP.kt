package problems

// We asume that the max possible number is 256

// Given a string of ip address without . and give back all possible valid ip address
// example: 4444 would be 4.4.4.4
// 12345678 would be : 1.234.56.78, 12.34.56.78, 123.4.56.78, 123.45.6.78 , 123.45.67.8

fun recomposeIP(stringIp: String) : List<IntArray> {
    val result = mutableListOf<IntArray>()
    findPath(IntArray(4), 0, stringIp, result)
    return result
}

private fun findPath(currentPath: IntArray, currentPathIndex: Int, stringIPLeft: String, result: MutableList<IntArray>) {
    if(currentPathIndex > 3 && stringIPLeft.isEmpty()) {
        result.add(currentPath)
        return
    }

    for(charIndexRange in 0..2) {

        // prevent out of bound
        if (stringIPLeft.length <= charIndexRange) {
            break
        }

        val tempPath = stringIPLeft.substring(0, charIndexRange + 1)

        // get the leftover string
        val newStringIPLeft = if ( charIndexRange + 1 >= stringIPLeft.length) {
            ""
        } else {
            stringIPLeft.substring(charIndexRange + 1, stringIPLeft.length)
        }

        if (isPathValid(currentPathIndex, newStringIPLeft, tempPath)) {
            //continue search path

            // copy array into new array
            val newPath = IntArray(4)
            for (index in currentPath.indices) {
                val pathValue = currentPath[index]
                newPath[index] = pathValue
            }

            newPath[currentPathIndex] = tempPath.toInt()


            findPath(newPath, currentPathIndex + 1, newStringIPLeft, result)
        } else {
            continue
        }
    }
}

private fun isPathValid(currentPathIndex: Int, stringIPLeft: String, tempPath: String) : Boolean {
    if (tempPath == "0" || tempPath.toInt() > 255) {
        return false
    }
    val maxStringLength = ((4 - currentPathIndex) * 3) - 3
    val minStringLength = ((4 - currentPathIndex) * 1) - 1
    return stringIPLeft.length in minStringLength..maxStringLength
}

fun main() {
    val list = recomposeIP("12345678")
    list.forEach { intArray ->
        val ipAddress = intArray.joinToString(".")
        println(ipAddress)
    }
}
