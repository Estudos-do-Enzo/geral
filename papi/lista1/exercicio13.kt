package lista1

fun main() {
    print("Por favor informe o seu nome: ")
    var nome = readLine()!!
    var idade: Double

    while (true) {
        try {
            print("Por favor informe sua idade: ")
            idade = readLine()!!.toDouble()
            if (idade <= 0) {
                throw NumberFormatException()
            }
            break
        } catch (e: NumberFormatException) {
            print("Idade inválida. Por favor, informe um número maior que zero, com um ponto como separador decimal.")
        }
    }
    
    if (idade >= 18) {
        println("Você é maior de idade $nome!")
    } else {
        println("Você é menor de idade $nome!")
    }
}