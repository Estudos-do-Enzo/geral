package lista2

fun main() {
    var temperaturaCelsiusDouble: Double

    while (true) {
        try {
            print("Por favor informe a temperatura em Celsius, usando o ponto como separador decimal: ")
            val temperaturaCelsiusString = readLine()
            temperaturaCelsiusDouble = temperaturaCelsiusString!!.toDouble()
            break
        } catch (e: NumberFormatException) {
            println("Erro: Por favor, informe um valor numérico válido, usando o ponto como separador decimal")
        }
    }

    val temperaturaFahrenheit = temperaturaCelsiusDouble * 9 / 5 + 32
    print("A temperatura equivalente em Fahrenheit é: ")
    println(temperaturaFahrenheit)
}