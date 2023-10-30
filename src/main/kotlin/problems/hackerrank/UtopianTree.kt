package problems.hackerrank

/*
*   HackerRank: UtopianTree
*   https://www.hackerrank.com/challenges/utopian-tree/problem
*/
fun utopianTree(n: Int): Int {
    var height = 1
    var cycle = 1
    for(period in 0..n) {
        if (period == 0) {
            continue
        } else {
            when(cycle) {
                1 -> {
                    height *= 2
                    cycle++
                }
                else -> {
                    height++
                    cycle = 1
                }
            }
        }
    }
    return height
}