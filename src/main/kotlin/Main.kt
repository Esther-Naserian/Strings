fun main() {
 myFunction("Akirachix")
    myVariables("banana")
    println(myParameters("Naserian",19))
    introduction("Naserian",19)
    println(myFunctions("Naserian"))
    myfun("Naserian")
    printMe("Naserian")
    printMe("Mercy")
    word("Akirachix")



}

fun myFunction(name: String){
    println(name.first())
    println(name[3])
    println(name[4])
    println(name[0])

}
fun myVariables(name: String){
    println(name[5])
    println(name[3])
    println(name[4])
    println(name.lastIndexOf("a"))
    println(name.lastIndexOf("n"))
    //println(name.firstIndexOf("a"))
    addb("Naserian")

}
fun myParameters(name: String,age: Int):String{
    return("Hi, my name is $name and I am $age years old")
}
fun introduction(name: String,age: Int){
    println("Hi, my name is $name and Iam $age years old")
}
fun myFunctions(name: String):Int{
    return(name.length)



}
fun myfun(name: String){
    println(name.length)
}
fun printMe(name: String){
     if (name=="Naserian")
     {println("That is me!")}
else {println("I don't know who that is")}
}
fun word(name: String){
    println(name[0]+" "+name[2]+" " + name[3])

}
fun addb(name: String){
 println("My name is $name")

}










