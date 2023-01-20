// Checking leap year//
fun main(){
    println("Enter the year:")
    var year= readLine()?.toInt()!!
    if(year%4==0){
        println("Its a leap year!!")
    }
    else{
        println("OOPS!! Its not a leap year!!")
    }
}