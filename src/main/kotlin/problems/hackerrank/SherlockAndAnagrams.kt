package problems.hackerrank

import java.util.*
import kotlin.collections.*

/*
*   HackerRank Problem : SherlockAndAnagrams
*   https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
* */

fun sherlockAndAnagrams(s: String): Int {

    val wordMap = mutableMapOf<String, Int>()

    for (i in s.indices) {
        for (j in (i+1)..s.length) {
            val substring = s.substring(i, j).toCharArray().sorted().joinToString(separator = "")
            wordMap[substring] = wordMap.getOrDefault(substring, 0) + 1
        }
    }

    var anagramPair = 0

    for (value in wordMap.values) {
        // the formula come from the combination formula (simplified) -> nC2
        anagramPair += (value * (value - 1)) / 2
    }

    return anagramPair

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = sherlockAndAnagrams(s)

        println(result)
    }
}