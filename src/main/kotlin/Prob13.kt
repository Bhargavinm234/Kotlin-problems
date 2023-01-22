//Convert fahrenheit to celsius//
fun main(){
    println("Enter the temperature in fahrenheit :")
    var f= readLine()?.toFloat()!!
    var c:Float
    c=((f-32)*5)/9
    println("The temperature in celsius is $c")
}