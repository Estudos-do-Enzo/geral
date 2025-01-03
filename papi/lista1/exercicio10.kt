package lista1

fun main() {
    println("Iremos calcular a média de 3 notas")
    var notas: ArrayList<Double> = ArrayList()
    
    var cont = 1
    while (cont < 4) {
        while (true) {
            try {
                print("Digite a nota $cont: ")
                val nota = readLine()!!.toDouble()
                if (nota < 0) {
                    throw NumberFormatException()
                }
                notas.add(nota)
                break
            } catch (e: NumberFormatException) {
                println("Por favor digite um número maior que zero válido, usando o ponto como separador decimal")
            }
        }
        cont = cont + 1
    }

    print("A média das notas é: ")
    println(notas.average())
}