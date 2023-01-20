//Finding whether number is odd or even//

fun main() {
    println("Enter the number:")
    var a = readLine()?.toInt()!!
    if (a % 2 == 0) {
        println("It is even number")
    }
    else{
        println("Its odd number!!")
    }
}