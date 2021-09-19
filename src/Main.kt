import kotlin.random.Random

fun main(){
    try {
        print("Enter number 1 : ")
        var num1 = readLine()!!.toInt()
        print("Enter number 2 : ")
        var num2 = readLine()!!.toInt()
        var num3 = Random.nextInt(0, 10)
        var result =  num1 * num3 + num2
        println("$num1 * x+ $num2 = $result" )
        println("What is x = $num2" )
        println("You Got It " )
    }catch (e:Exception){
        println("Pls Enter number only")
    }

}