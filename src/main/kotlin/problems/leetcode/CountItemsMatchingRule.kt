package problems.leetcode

/*
*   Leetcode: 1773. Count Items Matching a Rule
*   https://leetcode.com/problems/count-items-matching-a-rule/
*/

object CountItemsMatchingRule {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        var resultCount = 0
        val targetIndex = when(ruleKey) {
            "type" -> 0
            "color" -> 1
            else -> 2
        }
        items.forEach {
            if (it[targetIndex] == ruleValue) {
                resultCount++
            }
        }
        return resultCount
    }
}