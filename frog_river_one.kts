fun solution(X: Int, A: IntArray): Int {
    val leafOccurence = HashMap<Int, Boolean>()
    var uniquePositionsSum = 0
    var totalPositionsSum = 0

    (1..X).forEach { position ->
        leafOccurence[position] = false
        totalPositionsSum += position
    }
    for ((index, position) in A.withIndex()) {
        if (leafOccurence[position] == false) {
            leafOccurence[position] = true
            uniquePositionsSum += position
        }
        if (uniquePositionsSum == totalPositionsSum) {
            return index
        }
    }
    return -1
}

println("TESTS:")
println("(5, [1, 3, 1, 4, 2, 3, 5, 4]): ${solution(5, intArrayOf(1, 3, 1, 4, 2, 3, 5, 4))}")
println("(5, [1, 3, 1, 4, 1, 1, 5, 2, 5, 3, 4]): ${solution(5, intArrayOf(1, 3, 1, 4, 1, 1, 5, 2, 5, 3, 4))}")
println("(5, [1, 3, 1, 4, 5, 3, 4]): ${solution(5, intArrayOf(1, 3, 1, 4, 5, 3, 4))}")
