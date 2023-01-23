fun main(){
    println("Enter the size of array:")
    var n= readLine()?.toInt()!!
    println("Enter the elements:")
    var a=Array<Int>(n){ readLine()?.toInt()!! }
    println("Enter the target:")
    var t= readLine()?.toInt()!!
    for(i in 0..n-1){
        for(j in 0..n-1){
            if(i==j)
                continue
            if(a[i]+a[j]==t){
                println("The index of the numbers are $i and $j")
                break
            }
        }
        break
    }
}