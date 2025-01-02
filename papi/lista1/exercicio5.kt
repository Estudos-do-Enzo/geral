package lista1

fun main() {
    var salarioMinimo: Double = 0.0
    var salarioUsuario: Double = 0.0

    while (true) {
        try {
            print("Por favor digite o salário mínimo vigente, usando o ponto como separador decimal: ")
            var input = readLine()
            salarioMinimo = input!!.toDouble()
            if (salarioMinimo <= 0) {
                throw NumberFormatException("Número inválido")
            }
            break
        } catch (e: NumberFormatException) {
            println("Por favor digite um valor maior ou igual a zero")
        }
    }

    while (true) {
        try {
            print("Por favor digite o seu salário, usando o ponto como separador decimal: ")
            var input = readLine()
            salarioUsuario = input!!.toDouble()
            if (salarioMinimo <= 0) {
                throw NumberFormatException("Número inválido")
            }
            break
        } catch (e: NumberFormatException) {
            println("Por favor digite um valor maior ou igual a zero")
        }
    }

    print("Você ganha ")
    print(salarioUsuario / salarioMinimo)
    println(" salários mínimos")
}