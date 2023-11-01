package problems.leetcode

// https://leetcode.com/problems/ransom-note/?envType=study-plan-v2&envId=top-interview-150
object RansomNote {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val magazineCharMap = mutableMapOf<Char, Int>()
        val ransomNoteCharMap = mutableMapOf<Char, Int>()

        magazine.forEach {
            magazineCharMap[it] = (magazineCharMap[it] ?: 0) + 1
        }

        ransomNote.forEach {
            ransomNoteCharMap[it] = (ransomNoteCharMap[it] ?: 0) + 1
        }

        for (ransomCharKey in ransomNoteCharMap.keys) {
            if ((magazineCharMap[ransomCharKey] ?: 0) < (ransomNoteCharMap[ransomCharKey] ?: 0)) {
                return false
            }
        }

        return true
    }
}