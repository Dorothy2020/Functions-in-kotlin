fun main() {
    name()
    modulus()
    var sum=sum(20, 10, 30, 13)
    println(sum)
    Dorothy()
}

fun name(){
    var name="Hello Nancy"
    println(name)
}

fun modulus(){
    var num1=5
    var num2=7
    var modulus=num1%num2
    println(modulus)


}
fun sum(num1:Int, num2:Int,num3:Int,num4:Int):Int{
    var sum=num1+num2+num3+num4
    return sum

}

fun Dorothy(){
    var Dorothy =("She loves reading Books")
    println(Dorothy)
}


