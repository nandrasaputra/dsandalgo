package problems

/*
    Fractional knapsack problem can be solved by using greedy algorithm
*/

fun findMaxValue(listOfItems: List<Pair<Double, Double>>, knapsackMaxWeight: Double) : Double {

    var knapsackMaxValue = 0.0
    var knapsackWeightLeft = knapsackMaxWeight

    val sortedItem = listOfItems.sortedByDescending {
        it.first/it.second
    }

    for (pair in sortedItem) {

        if (knapsackWeightLeft >= pair.second) { // Take All Weight
            knapsackWeightLeft -= pair.second
            knapsackMaxValue += pair.first
        } else if (knapsackWeightLeft != 0.0) { // Take Just A Portion Of The Item
            val valueToTake = (knapsackWeightLeft/pair.second) * pair.first
            knapsackWeightLeft = 0.0
            knapsackMaxValue += valueToTake
        } else { // Break the loop, because there is no knapsack weight left
            break
        }
    }

    return knapsackMaxValue
}

fun main() {
    // Example Input, List of value, weight pair
    val exampleItemList = listOf(Pair(60.0, 10.0), Pair(120.0, 30.0), Pair(100.0, 20.0))
    // Example Input, knapsackMaxWeight
    val knapsackMaxWeight = 50.0
    // Execute the code then print the result
    println(findMaxValue(exampleItemList, knapsackMaxWeight))
}
