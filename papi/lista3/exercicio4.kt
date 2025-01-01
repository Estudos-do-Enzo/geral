package lista3

fun main() {
    var numero: Int 

    while (true) {
        try {
            print("Por favor digite um número positivo ou zero para ver seu fatorial: ")
            val input = readLine()
            numero = input!!.toInt()
            if (numero < 0) {
                throw Exception("Número inválido")
            }
            break
        } catch (e: Exception) {
            print("Por favor digite um número inteiro válido positivo ou zero")
        }
    }

    var cont = 1
    var total = 1

    if (numero < 2) {
        print("O fatorial de $numero é 1 \n")
    } else {
        while (cont <= numero) {
            total = total * cont
            cont += 1
        }
        print("O fatorial do número é $total \n")
    }
} 