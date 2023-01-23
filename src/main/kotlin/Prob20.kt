fun main(){
    println("Enter the number:")
    var a= readLine()?.toInt()!!
    var count=0
    while(a>0){
        a=a/10
        count++
    }
    println("The count is $count")
}