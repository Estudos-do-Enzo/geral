package lista2

fun main(){
    var numero: Int = 0

    while (true) {
        try {
            print("Por favor informe um número: ")
            val input = readLine()
            numero = input!!.toInt()
            break
        } catch (e: Exception) {
            println("Erro na conversão de string para número")
        }
    }

    print("O numero informado foi: $numero")
}