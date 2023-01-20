//Calculate simple interest//
fun main(){
    println("Enter the principal amount:")
    var p= readLine()?.toInt()!!
    println("Enter the time period:")
    var t= readLine()?.toInt()!!
    println("Enter the rate of interest:")
    var r= readLine()?.toFloat()!!
    var result=(p*t*r)/100
    println("The simple interest is:$result")
}