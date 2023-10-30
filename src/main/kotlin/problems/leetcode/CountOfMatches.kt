package problems.leetcode

/*
*   Leetcode: Count of Mathec in Tournament
*   https://leetcode.com/problems/count-of-matches-in-tournament/submissions/
*/

object CountOfMatches {
    class Solution {
        fun numberOfMatches(n: Int): Int {
            var numberOfTeam = n
            var numberOfMatches = 0
            while (numberOfTeam > 1) {
                if (numberOfTeam % 2 == 0) {
                    numberOfMatches += (numberOfTeam / 2)
                    numberOfTeam /= 2
                } else {
                    numberOfMatches += (numberOfTeam / 2)
                    numberOfTeam /= 2
                    numberOfTeam += 1
                }
            }
            return numberOfMatches
        }
    }
}