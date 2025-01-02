package lista1

fun main() {
    var reference: Double
    while (true) {
        try {
            print("Informe um valor numérico, usando o ponto como separador decimal: ")
            val input = readLine()
            reference = input!!.toDouble()
            if (reference <= 0) {
                throw NumberFormatException("Por favor informe um número maior que zero")
            }
            break
        } catch (e: NumberFormatException) {
            println("Por favor digite um valor numérico maior que zero com ponto como separador decimal")
        }
    }

    val valorFinal = reference * 1.05
    println("Este valor acrescido de 5% é igual a $valorFinal")
}
