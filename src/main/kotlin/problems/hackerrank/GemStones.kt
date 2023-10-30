package problems.hackerrank

/*
*   HackerRank: GemStones
*   https://www.hackerrank.com/challenges/gem-stones/problem
*/

fun gemstones(arr: Array<String>): Int {
    val arrayOfMineral = Array<Int>(26) {0}
    val base = 'a'.toInt()
    arr.forEach { minerals ->
        val setOfMineral = mutableSetOf<Int>()
        minerals.toCharArray().forEach { mineral ->
            setOfMineral.add(mineral.toInt() - base)
        }
        setOfMineral.forEach {
            arrayOfMineral[it]++
        }
    }
    val gemStone = arrayOfMineral.filter {
        it >= arr.size
    }
    return gemStone.size
}