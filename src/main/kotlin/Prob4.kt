//Program to swap 2 numbers//

fun main(){
    println("Enter the first number:")
    var a= readLine()?.toInt()!!
    println("Enter the second number:")
    var b= readLine()?.toInt()!!
    println("Numbers before swapping:a=$a and b=$b")
    var temp:Int
    temp=a
    a=b
    b=temp
    println("Numbers after swapping:a=$a and b=$b")
}