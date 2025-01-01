package lista1

fun main() {
    var a: Double
    var b: Double
    var c: Double

    while (true) {
        try {
            print("Por favor digite o primeiro número: ")
            val input = readLine()
            a = input!!.toDouble()
            break
        } catch (e: NumberFormatException) {
            println("Por favor digite um número vaĺido, com o ponto como separador decimel")
        }
    }

    while (true) {
        try {
            print("Por favor digite o segundo número: ")
            val input = readLine()
            b = input!!.toDouble()
            break
        } catch (e: NumberFormatException) {
            println("Por favor digite um número vaĺido, com o ponto como separador decimel")
        }
    }

    if (a == b) {
        println("Os números são iguais")
        print("A soma deles é: ")
        c = a + b
    } else {
        println("Os números são diferentes")
        print("A multiplicação entre eles é: ")
        c = a * b
    }
    println(c)

}