package lista3

fun main() {
    var valores: ArrayList<Int> = ArrayList()
    println("Por favor forneça valores diversos. Pressione 's' para ver qual o menor dos valores")

    while (true) {
        try {
            print("Digite um valor inteiro ou 's' para ver o menor valor que forneceu: ")
            val input = readLine()
            if (input == "s") {
                break
            }
            val valor = input!!.toInt()
            valores.add(valor)
        } catch (e: NumberFormatException) {
            println("Por favor forneça um número inteiro válido")
        }
    }

    valores.sort()
    val menorValor = valores[0]
    println("O menor valor fornecido foi: $menorValor")
    
}