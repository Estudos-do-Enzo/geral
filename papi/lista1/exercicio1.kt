package lista1

fun main() {
    var numero1: Float
    var numero2: Float
    var numero3: Float

    while (true) {
        try {
            print("Digite o número 1: ")
            var input = readLine()
            numero1 = input!!.toFloat()
            break
        } catch(e: Exception) {
            println("Informe um valor numérico, usando o ponto como separador decimal")
        }
    }

    while (true) {
        try {
            print("Digite o número 2: ")
            var input = readLine()
            numero2 = input!!.toFloat()
            break
        } catch(e: Exception) {
            println("Informe um valor numérico, usando o ponto como separador decimal")
        }
    }

    while (true) {
        try {
            print("Digite o número 3: ")
            var input = readLine()
            numero3 = input!!.toFloat()
            break
        } catch(e: Exception) {
            println("Informe um valor numérico, usando o ponto como separador decimal")
        }
    }
    
    val soma = numero1 + numero2
    println("A soma ente o número 1 e o número 2 é $soma")

    if (soma < numero3) {
        println("A soma entre o número 1 e o número 2 é menor que o número 3")
    } else if (soma == numero3) {
        println("A soma entre o número 1 e o número 2 é igual ao número 3")
    } else {
        println("A soma entre o número 1 e o número 2 é maior que o número 3")
    }
}