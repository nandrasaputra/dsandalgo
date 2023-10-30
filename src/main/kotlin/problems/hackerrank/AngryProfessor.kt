package problems.hackerrank

/*
*   HackerRank: Angry Professor
*   https://www.hackerrank.com/challenges/angry-professor/problem
*/

// if array element is less than or equal to 0 then
// the student is not laye
fun angryProfessor(k: Int, a: Array<Int>): String {
    var studentPresent = 0
    for (element in a) {
        if (element <= 0) {
            studentPresent++
        }
        if (studentPresent >= k) {
            break
        }
    }

    if (studentPresent >= k) {
        return "NO"
    } else {
        return "YES"
    }
}
