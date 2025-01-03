package lista1

fun main() {
	println("Vamos calcular um IMC")
    var peso: Double
    var altura: Double

    while (true) {
        try {
            print("Digite a altura: ")
            altura = readLine()!!.toDouble()
            if (altura <= 0) {
                throw NumberFormatException("Altura inválida. Por favor, digite um valor maior que zero.")
            }
            break
        } catch (e: NumberFormatException) {
            println("Erro ao ler o valor. Por favor, digite um número maior que zero, com o ponto como separador decimal.")
        }
    }

    while(true) {
        try {
            print("Digite o peso: ")
            peso = readLine()!!.toDouble()
            if (peso <= 0) {
                throw NumberFormatException("Peso inválido. Por favor, digite um valor maior que zero")
            }
            break
        } catch (e: NumberFormatException) {
            println("Erro ao ler o valor. Por favor, digite um número maior que zero, com ponto como separador decimal")
        }
    }

    val imc = peso / (altura * altura)
    println("Para os valores passados, o IMC é: $imc")
}