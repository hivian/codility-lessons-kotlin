fun solution(A: IntArray): Int {
    var sumPartA = A[0]
    var sumPartB = (1..A.size -1).sumBy { A[it] }
    var minDiff = Math.abs(sumPartA - sumPartB)

    for (index in 1..A.size - 1) {
        var diff = Math.abs(sumPartA - sumPartB)
        if (diff < minDiff) {
            minDiff = diff
        }
        if (minDiff == 0) break
        sumPartA += A[index]
        sumPartB -= A[index]
    }
    return minDiff
}

println("TESTS:")
println("[3, 1, 2, 4, 3]: ${solution(intArrayOf(3, 1, 2, 4, 3))}")
println("[3, 1, 4]: ${solution(intArrayOf(3, 1, 4))}")
println("[-1000, 1000]: ${solution(intArrayOf(-1000, 1000))}")
