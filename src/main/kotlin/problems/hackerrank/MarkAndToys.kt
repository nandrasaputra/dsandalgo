package problems.hackerrank

/*
*   HackerRank: Mark and Toys
*   https://www.hackerrank.com/challenges/mark-and-toys/problem
*/

// Complete the maximumToys function below.
fun maximumToys(prices: Array<Int>, k: Int): Int {
    var maxToys = 0
    var moneyLeft = k
    prices.sorted().let { sortedList ->
        for (index in sortedList.indices) {
            if (moneyLeft >= sortedList[index]) {
                moneyLeft -= sortedList[index]
                maxToys++
            } else {
                break
            }
        }
    }
    return maxToys
}