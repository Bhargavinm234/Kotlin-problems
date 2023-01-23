fun main(){
    println("Enter the number:")
    var n= readLine()?.toInt()!!
    var l= mutableListOf<Int>()
    for(i in 1..n)
    {
        if(n%i==0)
            l.add(i)
    }
    println("The factors aof given number are:${l}")
}