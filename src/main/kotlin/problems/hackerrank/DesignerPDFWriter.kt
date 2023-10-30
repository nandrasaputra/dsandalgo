package problems.hackerrank

/*
*   HackerRank: Designer PDF Design
*   https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
*/
fun designerPdfViewer(h: Array<Int>, word: String): Int {

    val baseIndex = ('a').toInt()
    var maxLetterHeight = 0
    word.toCharArray().forEach {
        val index = it.toInt() - baseIndex
        val height = h[index]
        if (height > maxLetterHeight) {
            maxLetterHeight = height
        }
    }

    return maxLetterHeight * word.length

}