package problems.hackerrank

/*
*   HackerRank: Strong Password
*   https://www.hackerrank.com/challenges/strong-password/problem
*/

fun minimumNumber(n: Int, password: String): Int {
    var digitAddition = 0
    val upperCaseRegex = Regex("[A-Z]+")
    val lowerCaseRegex = Regex("[a-z]+")
    val specialCharacterRegex = Regex("[!@#$%^&*()\\-+]+")
    val numberRegex = Regex("[0-9]+")

    if (!upperCaseRegex.containsMatchIn(password))
        digitAddition++

    if (!lowerCaseRegex.containsMatchIn(password))
        digitAddition++

    if (!specialCharacterRegex.containsMatchIn(password))
        digitAddition++

    if (!numberRegex.containsMatchIn(password))
        digitAddition++

    if (digitAddition+password.length < 6) {
        digitAddition += 6 - (password.length + digitAddition)
    }

    return digitAddition
}