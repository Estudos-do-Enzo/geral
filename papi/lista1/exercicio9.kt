package lista1

fun main() {
	println("Vamos calcular um IMC")
    var peso: Double
    var altura: Double

    while (true) {
        try {
            print("Digite a altura em metros: ")
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
            print("Digite o peso em kilos: ")
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
    print("O resultado da textual de uma avaliação é: ")

    if (imc < 18.5) {
        println("abaixo do peso")          
    } else if (imc < 25) {
        println("peso ideal (parabéns)")
    } else if (imc < 30) {
        println("levemente acima do peso")
    } else if (imc < 35) {
        println("obesidade grau I")
    } else if (imc < 40) {
        println("obesidade grau II (severa)")
    } else {
        println("obesidade grau III (mórbida)")
    }
}