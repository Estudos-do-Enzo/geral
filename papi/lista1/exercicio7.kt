package lista1

fun main() {
    var valor1: Boolean = false
    var valor2: Boolean = false

    while (true) {
        try {
            print("Por favor digite true of false: ")
            val resposta = readLine()
            if (resposta != "true" && resposta != "false") {
                throw Exception("Por favor escreva 'true' of 'false' (sem aspas)")
            }
            if (resposta == "true") {
                valor1 = true
            }
            break
        } catch (e: Exception) {
            println("Por favor escreva 'true' of 'false' (sem aspas)")
        }
    }

    while (true) {
        try {
            print("Ok! Outro valor. Por favor digite true of false: ")
            val resposta = readLine()
            if (resposta != "true" && resposta != "false") {
                throw Exception("Por favor escreva 'true' of 'false' (sem aspas)")
            }
            if (resposta == "true") {
                valor2 = true
            }
            break
        } catch (e: Exception) {
            println("Por favor escreva 'true' of 'false' (sem aspas)")
        }
    }

    if (valor1 && valor2) {
        println("Ambos os valores são true")
    } else if (!valor1 && !valor2) {
        println("Ambos os valores são false")
    } else {
        println("O valor 1 é $valor1")
        println("O valor 2 é $valor2")
    }
}