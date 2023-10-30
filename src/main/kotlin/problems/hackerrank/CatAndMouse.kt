package problems.hackerrank

/*
*   HackerRank: Cat and Mouse
*   https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
*/

fun catAndMouse(x: Int, y: Int, z: Int): String {
    // Calculate the distance between Cat A and Mouse C
    val catADistance = Math.abs(x-z)
    // Calculate the distance between Cat B and Mouse C
    val catBDistance = Math.abs((y-z))

    if (catADistance == catBDistance) {
        return "Mouse C"
    } else if (catADistance < catBDistance) {
        return "Cat A"
    } else {
        return "Cat B"
    }
}
