fun solution(N: Int): Int {
    val binaryString = Integer.toBinaryString(N)
    var count: Int = 0
    var tmpCount: Int = 0
    var firstOne: Boolean = false

    for (digit in binaryString) {
        if (digit == '0' && firstOne) {
            tmpCount++
        }
        if (digit == '1') {
            if (!firstOne) {
                firstOne = true
            }
            if (tmpCount > count) {
                count = tmpCount
            }
            tmpCount = 0
        }
    }
    return count
}

println("TESTS:")
println("n=1041=10000010001: ${solution(1041)}")
println("n=15=1111: ${solution(15)}")
println("n=32=100000: ${solution(32)}")
println("n=561892=10001001001011100100: ${solution(561892)}")
println("n=74901729=100011101101110100011100001: ${solution(74901729)}")
// Etc.
