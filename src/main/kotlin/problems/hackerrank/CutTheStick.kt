package problems.hackerrank

/*
*   HackerRank: Cut The Stick
*   https://www.hackerrank.com/challenges/cut-the-sticks/problem
*/
fun cutTheSticks(arr: Array<Int>): Array<Int> {
    var currentStick = arr.size
    val resultList = mutableListOf<Int>()
    val numberMap = mutableMapOf<Int, Int>()
    arr.forEach { arrayElement ->
        numberMap[arrayElement] = numberMap.getOrDefault(arrayElement, 0) + 1
    }
    resultList.add(currentStick)

    val sortedMap = numberMap.toSortedMap()

    for (mapEntry in sortedMap) {
        currentStick -= mapEntry.value
        resultList.add(currentStick)
    }

    resultList.removeAt(resultList.size-1)
    val result = Array(resultList.size){0}
    for (index in result.indices) {
        result[index] = resultList[index]
    }

    return result
}