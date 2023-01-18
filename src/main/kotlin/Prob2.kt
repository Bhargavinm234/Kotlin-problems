//Program to input members(integers,float,double) at run timr//
fun main(){
    println("Enter numbers:")
    var a= readLine()?.toInt()!!
    var b= readLine()?.toDouble()!!
    var c= readLine()?.toFloat()!!
    var d= readLine()?.toString()!!
    println("The integer value is $a")
    println("The double value is $b")
    println("The float value is $c")
    println("The string is $d")
}