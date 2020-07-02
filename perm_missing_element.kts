fun solution(A: IntArray): Int {
    A.sort()
    return binarySearch(A)
}

fun binarySearch(A: IntArray): Int {
    val totalSize = A.size
    val array1 = A.copyOfRange(0, (totalSize + 1) / 2)
    val array2 = A.copyOfRange((totalSize + 1) / 2, totalSize)

    return when {
        !isConsecutiveIntList(array1) -> binarySearch(array1)
        !isConsecutiveIntList(array2) -> binarySearch(array2)
        !isConsecutiveIntList(A) -> array1.last() + 1
        else -> {
            when {
                totalSize == 0 -> totalSize + 1
                A.first() == 2 -> A.first() - 1
                else -> A.last() + 1
            }
        }
    }
}

fun isConsecutiveIntList(A: IntArray) : Boolean {
    if (A.isEmpty()) return true
    return A.last() - A.first() + 1 == A.size
}

println("TESTS:")
println("[2, 3, 1, 5]: ${solution(intArrayOf(2, 3, 1, 5))}")
println("[1, 2, 3]: ${solution(intArrayOf(1, 2, 3))}")
println("[2, 3, 4]: ${solution(intArrayOf(2, 3, 4))}")
println("[7, 1, 3, 4, 5, 6]: ${solution(intArrayOf(7, 1, 3, 4, 5, 6))}")
println("[1]: ${solution(intArrayOf(1))}")
println("[2]: ${solution(intArrayOf(2))}")
println("[]: ${solution(intArrayOf())}")
