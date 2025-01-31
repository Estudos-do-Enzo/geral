package lista3

import kotlin.math.ceil

fun main() {
    var numero:Int
    while (true) {
        try {
            print("Informe um número inteiro maior que zero: ")
            val entradaString = readLine()
            numero = entradaString!!.toInt()
            if (numero > 0) {
                break
            }
            throw Exception()
        } catch (e: Exception) {
            println("Número inválido. Por favor, informe um número inteiro maior que zero.")
        }
    }

    val limiteDivisao = ceil(numero / 2.0)
    
    var divisor = 2
    var primo = true
    while (divisor <= limiteDivisao) {
        if (numero % divisor == 0) {
            primo = false
            break
        }
        divisor++
    }

    if (primo) {
        println("O número $numero é primo.")
    } else {
        println("O número $numero não é primo.")
    }
}