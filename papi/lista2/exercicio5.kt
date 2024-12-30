package lista2

fun main(){
    var metros: Float

    while (true) {
        try {
            print("Por favor informe uma medida em centímetros: ")
            val input = readLine()
            metros = input!!.toFloat()
            break
        } catch (e: Exception) {
            println("Erro na conversão de string para número")
        }
    }

    print("Este valor convertido em centímetros equivale a " + (metros * 100))
}