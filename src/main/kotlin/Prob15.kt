// Calculate lcm of 2 numbers//
fun main(){
    println("Enter the first number:")
    var a= readLine()?.toInt()!!
    println("Enter the second number:")
    var b= readLine()?.toInt()!!
    var lcm=if(a>b) a else b
    while(true) {
        if (lcm % a == 0 && lcm % b == 0) {
            break;
        }
        lcm++
    }
    println("The lcm is $lcm")
}