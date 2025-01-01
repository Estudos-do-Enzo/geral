package lista1

fun main() {
    var numero: Int
    while (true) {
        try {
            print("Por favor informe um número inteiro: ")
            val input = readLine()
            numero = input!!.toInt()
            break
        } catch (e: NumberFormatException) {
            println("Por favor digite um número inteiro")
        }
    }

    print("O sucessor do número é: ")
    println(numero + 1)
    print("O antecessor do número é: ")
    println(numero - 1)
}