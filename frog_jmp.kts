fun solution(X: Int, Y: Int, D: Int): Int {
    var jumpCount = (Y.toDouble() - X) / D
    return Math.ceil(jumpCount).toInt()
}

println("TESTS:")
println("(X=10, Y=85, D=30): ${solution(10, 85, 30)}")
println("(X=10, Y=100, D=30): ${solution(10, 100, 30)}")
println("(X=1, Y=10000, D=1): ${solution(1, 10000, 1)}")
println("(X=1, Y=2, D=1): ${solution(1, 2, 1)}")
println("(X=1, Y=2, D=2): ${solution(1, 2, 2)}")
