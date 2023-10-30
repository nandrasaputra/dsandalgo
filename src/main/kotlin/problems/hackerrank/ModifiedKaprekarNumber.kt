package problems.hackerrank

/*
*   HackerRank: Modified Kaprekar Number
*   https://www.hackerrank.com/challenges/kaprekar-numbers/problem
*/

fun kaprekarNumbers(p: Int, q: Int): Unit {
    val kaprekarNumberList: MutableList<Int> = mutableListOf()
    for (number in p..q) {
        val numberSquareString = (number.toLong() * number).toString()
        val left = numberSquareString.substring(0,(numberSquareString.length/2))
        val right = numberSquareString.substring((numberSquareString.length/2))

        val leftNumber = if (left.isEmpty()) 0 else left.toInt()
        val rightNumber = if (right.isEmpty()) 0 else right.toInt()

        if (leftNumber + rightNumber == number) {
            kaprekarNumberList.add(number)
        }
    }

    if (kaprekarNumberList.isEmpty()) {
        println("INVALID RANGE")
    } else {
        println(kaprekarNumberList)
    }
}