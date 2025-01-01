package lista1

fun main() {
    var numero: Int

    while (true) {
        try {
            print("Digite um número inteiro: ")
            var input = readLine()
            numero = input!!.toInt()
            break
        } catch (e: NumberFormatException) {
            println("Por favor digite um número inteiro")
        }
    }

    if (numero % 2 == 0) {
        println("O número é par")
    } else {
        println("O número é ímpar")
    }

    if (numero == 0) {
        println("O número é igual a zero")
    } else if (numero > 0) {
        println("O número é maior que zero")
    } else {
        println("O número é menor que zero")
    }
}