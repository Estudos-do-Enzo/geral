package lista2

fun main() {
    var alturaDouble: Double
    var sexoString: String

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

    while (true) {
        try {
            print("Por favor informe se é homem ou mulher, inserindo 'H' ou 'M': ")
            sexoString = readLine()!!
            sexoString = sexoString.uppercase()
            if (sexoString != "H" && sexoString != "M") {
                throw IllegalArgumentException()
            }
            break
        } catch (e: IllegalArgumentException) {
            println("Por favor informe 'H' ou 'M'")
        }
    }

    var pesoIdeal: Double
    if (sexoString == "H") {
        pesoIdeal = (72.7 * alturaDouble) - 58
    } else {
        pesoIdeal = (62.1 * alturaDouble) - 44.7
    }
    print("O seu peso ideal é: ")
    print(pesoIdeal)
    println(" kg")
}