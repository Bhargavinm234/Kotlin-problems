fun main(){
    var a=arrayOf(2,3,4,7,9,11)
    var max=a[0]
    var i=0
    for(i in 0..a.size-1)
    {
        if(a[i]>max)
        {
            max=a[i]
        }
    }
    println("Max element is $max")
}