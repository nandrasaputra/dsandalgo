package problems

/*
*   Given a sorted array, find the occurrence of k
*
*   example 1:
*   array = [1,2,2,3,3,4]
*   k = 2
*   answer = 2
*
*   example 2:
*   array = [2,3,3,3,3,4,6,10]
*   k = 4
*   answer = 1
*
* */

fun getOccurrenceOfK(k: Int, sortedArray: IntArray) : Int {
    if (sortedArray.isEmpty()) {
        return 0
    }

    val firstKFoundIndex = findKFirstFoundIndex(sortedArray, k, 0, sortedArray.size-1)

    return if (firstKFoundIndex != null) {
        val startIndex = searchKStartIndex(sortedArray, k, 0, firstKFoundIndex)
        val endIndex = searchKEndIndex(sortedArray, k, firstKFoundIndex, sortedArray.size-1)
        return endIndex - startIndex + 1
    } else {
        0
    }
}

private fun findKFirstFoundIndex(array: IntArray, k: Int, startBound: Int, endBound: Int) : Int? {
    val midIndex = (endBound + startBound) / 2

    // cannot found the k, we have search through the boundaries
    if (startBound > endBound) {
        return null
    }

    return if (array[midIndex] == k) {
        midIndex
    } else {
        if (array[midIndex] > k) {
            findKFirstFoundIndex(array, k, startBound, midIndex -1)
        } else {
            findKFirstFoundIndex(array, k, midIndex+1, endBound)
        }
    }
}

private fun searchKStartIndex(array: IntArray, k: Int, startBound: Int, endBound: Int) : Int {

    if (startBound > endBound) {
        return endBound
    }

    val prevIndex = endBound -1
    if (prevIndex < 0) {
        return endBound
    }

    return if (array[prevIndex] == k) {
        val midIndex = (startBound + endBound) / 2
        if (array[midIndex] == k) {
            searchKStartIndex(array, k, startBound, prevIndex)
        } else {
            searchKStartIndex(array, k, prevIndex, endBound)
        }
    } else {
        endBound
    }
}

private fun searchKEndIndex(array: IntArray, k: Int, startBound: Int, endBound: Int) : Int {
    if (startBound > endBound) {
        return startBound
    }

    val nextIndex = startBound + 1
    if (nextIndex > array.size-1) {
        return startBound
    }

    return if (array[nextIndex] == k) {
        val midIndex = (startBound + endBound) / 2
        if (array[midIndex] == k) {
            searchKEndIndex(array, k, nextIndex, endBound)
        } else {
            searchKEndIndex(array, k, startBound, nextIndex)
        }
    } else {
        startBound
    }
}

fun main() {
    val array = intArrayOf(0,1,2,2,3,3,4,4,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8)
    print(getOccurrenceOfK(2, array))
}