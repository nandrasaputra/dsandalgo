package problems.hackerrank

/*
*   HackerRank: Flatland Space Stations
*   https://www.hackerrank.com/challenges/flatland-space-stations/problem
*/

fun flatlandSpaceStations(n: Int, c: Array<Int>): Int {
    var maxDistance: Int
    val sortedArray = c.sorted()
    if (sortedArray.size == n) {
        maxDistance = 0
    } else if (sortedArray.size == 1) {
        maxDistance = Math.max(Math.abs(0-sortedArray[0]), Math.abs(n-1-sortedArray[0]))
    } else {
        maxDistance = Math.max(Math.abs(0-sortedArray[0]), Math.abs(n-1-sortedArray[sortedArray.size-1]))
        for (arrayIndex in 0..sortedArray.size-2) {
            val currentIndex = sortedArray[arrayIndex]
            val nextIndex = sortedArray[arrayIndex+1]
            val midIndex = Math.ceil((currentIndex + nextIndex) / 2.0).toInt()
            val tempResult = nextIndex-midIndex
            maxDistance = Math.max(tempResult, maxDistance)
        }
    }

    return maxDistance
}