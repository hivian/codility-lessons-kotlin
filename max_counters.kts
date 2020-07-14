fun solution(N: Int, A: IntArray): IntArray {
    var counterArray = IntArray(N) { 0 }
    var maxCounterValue = 0
    var lastCounterValue = 0

    for (value in A) {
        when {
            value <= N -> {
                counterArray[value - 1]++
                if (counterArray[value - 1] > maxCounterValue) {
                    maxCounterValue++
                }
            }
            value == N + 1 && lastCounterValue < maxCounterValue -> {
                repeat(N) { counterArray[it] = maxCounterValue }
                lastCounterValue = maxCounterValue
            }
        }
    }
    return counterArray
}

println("TESTS:")
println("(5, [3, 4, 4, 6, 1, 4, 4]): ${solution(5, intArrayOf(3, 4, 4, 6, 1, 4, 4)).contentToString()}")
println("(5, [1, 6, 6, 3, 6, 6, 2, 6, 6]): ${solution(5, intArrayOf(1, 6, 6, 3, 6, 6, 2, 6, 6)).contentToString()}")
println("(5, [6, 6, 6, 6, 6, 6]): ${solution(5, intArrayOf(6, 6, 6, 6, 6, 6)).contentToString()}")
