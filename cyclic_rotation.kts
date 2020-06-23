fun solution(A: IntArray, K: Int): IntArray {
    if (A.isEmpty()) return A

    val rotationCount = K % A.size
    val oldArray = A.toMutableList()
    val newArray = mutableListOf<Int>()

    repeat(rotationCount) {
        newArray.add(0, oldArray.last())
        oldArray.removeAt(oldArray.size - 1)
    }
    newArray.addAll(oldArray)

    return newArray.toIntArray()
}

println("TESTS:")
println("([3, 8, 9, 7, 6], 3): ${solution(intArrayOf(3, 8, 9, 7, 6), 3).toList()}")
println("([0, 0, 0], 1): ${solution(intArrayOf(0, 0, 0), 1).toList()}")
println("([1, 2, 3, 4], 4): ${solution(intArrayOf(1, 2, 3, 4), 4).toList()}")
println("([1, -1], 10000): ${solution(intArrayOf(1, -1), 10000).toList()}")
println("([1], 50): ${solution(intArrayOf(1), 50).toList()}")
println("([], 50): ${solution(intArrayOf(), 5).toList()}")
println("([0, 0, -2, 10, -7, -5, -5, -5, -8], 8): ${solution(intArrayOf(0, 0, -2, 10, -7, -5, -5, -5, -8), 8).toList()}")
// Etc.
