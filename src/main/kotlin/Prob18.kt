fun main(){
    println("Enter the number:")
    var n= readLine()?.toInt()!!
    var t1=0
    var t2=1
    var count=1
    while(count<=n)
    {
        println(t1)
        var s=t1+t2
        t1=t2
        t2=s
        count++
    }
}