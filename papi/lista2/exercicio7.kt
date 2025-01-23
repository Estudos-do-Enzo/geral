package lista2

fun main() {
    var lado: Double
    while (true) {
        try {
            print("Digite o lado de um quadrado em centímetros, usando o ponto como separador decimal: ")
            val ladoString = readLine() 
            lado = ladoString!!.toDouble()
            break
        } catch (e: Exception) {
            println("Por favor, insira um valor válido para o lado do quadrado, usando o ponto como separador decimal")
        }
    }
    val area = lado * lado
    println("A área do quadrado de lado $lado centímetro(s) é $area centímetro(s) quadrado(s)")
    println("O dobro desta área é ${area * 2} centímetro(s) quadrado(s)")
}   