package lista2

fun main(){
    var notas = mutableListOf<Double>()

    var count = 0

    while (count < 4) {
        try {
            print("Por favor informe uma nota: ")
            val input = readLine()
            notas.add(input!!.toDouble())
            count++           
        } catch (e: Exception) {
            println("Erro na conversão de string para número")
        }
    }

    val media = notas.sum() / notas.size
    print("A média das notas é $media")
}