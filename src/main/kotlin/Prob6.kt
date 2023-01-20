//Finding a number is positive negative or zero//
fun main(){
    println("Enter the number:")
    var num= readLine()?.toInt()!!
    if(num==0){
        println("The number you entered is $num")
    }
    else if(num>0){
        println("The number $num you entered is positive")
    }
    else{
        println("The number $num you entered is negative")
    }
}