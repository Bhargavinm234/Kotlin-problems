// Program to find largest of 3 numbers//

fun main(){
    println("Enter three numbers:")
    var a= readLine()?.toInt()!!
    var b= readLine()?.toInt()!!
    var c= readLine()?.toInt()!!
    println("The three numbers are:$a $b $c")

    if(a>b && a>c)
    {
        println("$a is greater")
    }
    else if(b>a && b>c)
    {
        println("$b is greater")
    }
    else
    {
        println("$c is greater")
    }
}