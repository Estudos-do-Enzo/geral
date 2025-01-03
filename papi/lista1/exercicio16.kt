package lista1

fun main() {
    println("Vamos determinar o tipo de um triângulo pelos seus lados.")
    var lados: ArrayList<Double> = ArrayList()
    var cont = 1
    while (cont < 4) {
        while (true) {
            try {
                print("Digite o valor do lado $cont: ")
                var input = readLine()
                lados.add(input!!.toDouble())
                if (lados[cont - 1] < 0) {
                    // Vamos lançar uma exception, mas temos que remover o valor do ArrayList
                    // lados, pois já o inserimos
                    lados.removeAt(cont - 1)
                    throw NumberFormatException()
                }
                break
            } catch (e: NumberFormatException) {
                println("Valor inválido. Por favor, digite um valor numérico maior que zero.")
            }
        }
        cont++
    }

    if (lados[0] == lados[1] && lados[1] == lados[2]) {
        println("O triângulo é equilátero.")
    } else if (lados[0] == lados[1] || lados[1] == lados[2] || lados[0] == lados[2]) {
        println("O triângulo é isósceles.")
    }  else {
        println("O triângulo é escaleno.")
    }
}