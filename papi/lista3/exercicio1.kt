package lista3

fun main() {
    var lista:ArrayList<Int> = arrayListOf()

    while (true) {
        try {
            print("Por favor informe um número ou 's' para sair: ")
            var input = readLine()
            if (input == "s") {
                break
            } else {
                lista += input!!.toInt()
            }
        } catch (e: Exception) {
            print("Por favor informe um número válido ou 's' para sair")
        }        
    }
    val maiorNumero = lista.sorted()[lista.size - 1]
    print("O maior número dos passados foi o $maiorNumero \n")
}