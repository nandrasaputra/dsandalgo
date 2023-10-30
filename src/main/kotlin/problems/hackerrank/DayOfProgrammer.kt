package problems.hackerrank

/*
        HackerRank: DayOfProgrammer
*       https://www.hackerrank.com/challenges/day-of-the-programmer/problem
* */

// Complete the dayOfProgrammer function below.
fun dayOfProgrammer(year: Int): String {
    return if (year in 1700..1917) {    // Julian Calendar
        if (year % 4 == 0) {
            "12.09.$year"
        } else {
            "13.09.$year"
        }
    } else if (year == 1918) {      // Transition year to Gregorian Calendar
        "26.09.$year"
    } else if (year in 1919..2700) {    // Gregorian Calendar
        if (year % 400 == 0) {
            "12.09.$year"
        } else if (year % 4 == 0 && year % 100 != 0) {
            "12.09.$year"
        } else {
            "13.09.$year"
        }
    } else {
        ""
    }
}

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}