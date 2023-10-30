package problems.hackerrank

import java.math.BigInteger

/*
*   HackerRank: ACM ICPC Team
*   https://www.hackerrank.com/challenges/acm-icpc-team/problem
*/

fun acmTeam(topic: Array<String>): Array<Int> {
    var currentMaxSubject = 0
    var currentTeamCount = 0

    for (a in 0..topic.size-2) {
        for (b in (a+1) until topic.size) {
            val subjectCount = orTwoString(topic[a], topic[b])
            if (subjectCount > currentMaxSubject) {
                currentMaxSubject = subjectCount
                currentTeamCount = 1
            } else if (subjectCount == currentMaxSubject) {
                currentTeamCount++
            }
        }
    }

    return arrayOf(
        currentMaxSubject,
        currentTeamCount
    )
}

private fun orTwoString(firstString : String, secondString: String) : Int {
    val firstBigInt = BigInteger(firstString, 2)
    val secondBigInt = BigInteger(secondString, 2)
    val orResult = firstBigInt or secondBigInt
    return orResult.bitCount()
}