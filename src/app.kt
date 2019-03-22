fun main(args: Array<String>){
    val text = "Hi this is kotlin"
    val s = Sample()
    println(text)
    fun1(text)
    s.javamethod(text)
}

fun fun1(text:String){
    println("Called from main method :"+text)
}