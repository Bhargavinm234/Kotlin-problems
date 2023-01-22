// Calculate gcd or hcf of a number//
fun main(){
    println("Enter the first number:")
    var a= readLine()?.toInt()!!
    println("Enter the second number:")
    var b= readLine()?.toInt()!!
    var gcd=1
    var i=1
    while(i<=a && i<=b){
        if(a%i==0 && b%i==0)
        {
            gcd=i
        }
        i++
    }
    println("The gcd of a $a and $b is $gcd")
}