fun main(){
    println("Enter the number:")
    var n= readLine()?.toInt()!!
    var sum=0
    while(n>0){
        var a=n%10
        sum+=a
        n=n/10
    }
    println("The sum is $sum")
}