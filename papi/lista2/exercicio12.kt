package lista2

fun main() {
    var alturaDouble: Double

    while (true) {
        try {
            print("Por favor informe a sua altura em metros, usando o ponto como um separador decimal: ")
            val alturaString = readLine()
            alturaDouble = alturaString!!.toDouble()
            break
        } catch (e: NumberFormatException) {
            println("Por favor informe um número válido, usando o ponto como separador decimal")
        }
    }

    val pesoIdeal = (72.7 * alturaDouble) - 58
    print("O seu peso ideal é: ")
    print(pesoIdeal)
    println(" kg")
}