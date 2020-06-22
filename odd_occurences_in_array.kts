fun solution(A: IntArray): Int {
    A.sort()
    var count = 0
    var lastNumber = A.first()
    
    for (number in A) {
        if (number != lastNumber) {
            if (count % 2 == 0) {
                count = 0
            } else {
                return lastNumber
            }
        }
        lastNumber = number
        count++
    }
    return lastNumber
}

println("TESTS:")
println("[25]: ${solution(intArrayOf(25))}")
println("[4, 5, 5]: ${solution(intArrayOf(4, 5, 5))}")
println("[5, 5, 4]: ${solution(intArrayOf(5, 5, 4))}")
println("[5, 4, 5]: ${solution(intArrayOf(5, 4, 5))}")
println("[5, 5, 6, 7, 7, 7, 7]: ${solution(intArrayOf(5, 5, 6, 7, 7, 7, 7))}")
println("[9, 3, 9, 3, 9, 7, 7, 9, 8, 8, 8, 9, 9]: ${solution(intArrayOf(9, 3, 9, 3, 9, 7, 7, 9, 8, 8, 8, 9, 9))}")
println("[9, 3, 9, 3, 9, 7, 7, 9, 6, 9, 9]: ${solution(intArrayOf(9, 3, 9, 3, 9, 7, 7, 9, 6, 9, 9))}")
println("[9, 3, 9, 3, 9, 7, 7, 9, 17, 9, 9]: ${solution(intArrayOf(9, 3, 9, 3, 9, 7, 7, 9, 17, 9, 9))}")
