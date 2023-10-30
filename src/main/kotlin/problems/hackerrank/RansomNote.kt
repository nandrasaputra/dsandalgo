package problems.hackerrank

import java.util.*

/*
*   HackerRank Problem : Ransom Note
*   https://www.hackerrank.com/challenges/ctci-ransom-note/problem
* */

fun checkMagazine(magazine: Array<String>, note: Array<String>): Unit {
    val magazineMap = mutableMapOf<String, Int>()
    var containAllWord = true

    magazine.forEach {
        if (magazineMap.containsKey(it)) {
            magazineMap[it] = magazineMap[it]!! + 1
        } else {
            magazineMap[it] = 1
        }
    }

    for (index in note.indices) {
        if (magazineMap.containsKey(note[index])) {
            if (magazineMap[note[index]]!! >= 1) {
                magazineMap[note[index]] = magazineMap[note[index]]!! - 1
            } else {
                containAllWord = false
                break
            }
        } else {
            containAllWord = false
            break
        }
    }

    if (containAllWord) {
        println("Yes")
    } else {
        println("No")
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val mn = scan.nextLine().split(" ")

    val m = mn[0].trim().toInt()

    val n = mn[1].trim().toInt()

    val magazine = scan.nextLine().split(" ").toTypedArray()

    val note = scan.nextLine().split(" ").toTypedArray()

    checkMagazine(magazine, note)
}