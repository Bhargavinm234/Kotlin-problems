fun main() {
    println("Enter the value of n:")
    var n = readLine()?.toInt()!!
    var evensum = 0
    var oddsum = 0
    for (a in 1..n) {
        if (a % 2 == 0) {
            evensum += a
        } else {
            oddsum += a
        }
    }
    println("The sum of even numbers is $evensum")
    println("The sum of odd numbers is $oddsum")
}