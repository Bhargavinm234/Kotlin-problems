fun main(){
    println("Enter the number:")
    var n= readLine()?.toInt()!!
    var fact=1
    for(i in 1..n){
        fact*=i
    }
    println("The factorial of number is:$fact")
}