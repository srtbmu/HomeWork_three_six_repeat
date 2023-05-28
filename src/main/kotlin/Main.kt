import javax.naming.Name

fun main(args: Array<String>) {
    println("Program arguments: ${args.joinToString()}")

    val name1 = "ARGEN"
    val name2 = "SYR"
    val name3 = "SEKA"
    val name4 = "BEMA"
    lateinit var name: String
    name = name1.substring(1,2)
    print(name)
    name = name2.substring(1,2)
    print(name)
    name = name3.substring(0,1)
    print(name)
    name = name4.substring(3,4)
    print(name)
    println(" ")

    val number1 = 10.0
    val number2 = 5.0

    val result = calculate(number1, number2, "+")
    println("Результат: $result")


}
private fun calculate(number1: Double, number2: Double, operator: String): Double {
    return when (operator) {
        "+" -> number1 + number2
        "-" -> number1 - number2
        "*" -> number1 * number2
        "/" -> number1 / number2
        else -> throw IllegalArgumentException("Неподдерживаемая операция")
    }
}
