fun main(){
    println("Enter the size of array:")
    var n= readLine()?.toInt()!!
    println("Enter the elements:")
    var a=Array<Int>(n){ readLine()?.toInt()!! }
    var max=a[0]
    println("The elemets of array are:")
    for(i in a) {
        print("$i \t")
    }
    for(i in a){
        if(i>max)
        {
            max=i
        }
    }
    println()
    println("Max element is $max")
}