package lista1

fun main() {
    println("Vamos ordenar 3 valores")
    var valores: ArrayList<Double> = ArrayList();

    while (true) {
        try {
            print("Digite o primeiro valor: ")
            val input = readLine()
            valores.add(input!!.toDouble())
            break
        } catch (e: NumberFormatException) {
            println("Por favor digite um valor numérico, com o ponto como separador decimal")
        }
    }

    while (true) {
        try {
            print("Digite o segundo valor: ")
            val input = readLine()
            valores.add(input!!.toDouble())
            break
        } catch (e: NumberFormatException) {
            println("Por favor digite um valor numérico, com o ponto como separador decimal")
        }
    }

    while (true) {
        try {
            print("Digite o terceiro valor: ")
            val input = readLine()
            valores.add(input!!.toDouble())
            break
        } catch (e: NumberFormatException) {
            println("Por favor digite um valor numérico, com o ponto como separador decimal")
        }
    }

    valores.sort()
    print("Um ArrayList com os valores ordenados é igual a: ")
    println(valores)

}