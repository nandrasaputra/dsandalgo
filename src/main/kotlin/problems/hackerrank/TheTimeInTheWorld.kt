package problems.hackerrank

/*
*   HackerRank: The Time In The World
*   https://www.hackerrank.com/challenges/the-time-in-words/problem
*/

fun timeInWords(h: Int, m: Int): String {
    val wordsArray: Array<String> = arrayOf(
        "zero",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "fifteen",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen",
        "twenty",
        "twenty one",
        "twenty two",
        "twenty three",
        "twenty four",
        "twenty five",
        "twenty six",
        "twenty seven",
        "twenty eight",
        "twenty nine"
    )

    return if (m == 0) {
        "${wordsArray[h]} o' clock"
    } else if (m in 1..30) {
        if (m == 15) {
            "quarter past ${wordsArray[h]}"
        } else if (m == 30) {
            "half past ${wordsArray[h]}"
        } else if (m == 1) {
            "one minute past ${wordsArray[h]}"
        } else {
            "${wordsArray[m]} minutes past ${wordsArray[h]}"
        }
    } else {
        if (m == 45) {
            "quarter to ${wordsArray[h+1]}"
        } else if (m == 60) {
            "${wordsArray[h+1]} o' clock"
        } else {
            "${wordsArray[60-m]} minutes to ${wordsArray[h+1]}"
        }
    }
}