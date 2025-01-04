package lista3

fun main() {
    println("Eu gostaria que você informasse uma lista de números INTEIROS, pode ser fora de ordem, e eu encontrarei o primeiro que falta.")

    var numero: Int
    var numeros: ArrayList<Int> = ArrayList()

    while (true) {
        try {
            print("Digite um número ou 's' para sair: ")
            val input = readLine()

            if (input == "s") {
                break
            }

            numero = input!!.toInt()
            numeros.add(numero)
        } catch (e: NumberFormatException) {
            println(e)
        }
    }

    if (numeros.isEmpty()) {
        println("Não foram informados números.")
    } else {
        numeros.sort()
        
        var i = numeros[0]
        var numeroNaoEncontrado: Int
        while (i < numeros[numeros.size - 1]) {
            if (! numeros.contains(i)) {
                println("Não foi encontrado o numero $i")
                break
            }
            i++
        }

        if (i == numeros[numeros.size - 1]) {
            println("Não há números faltando na lista.")
        }
    }
}

