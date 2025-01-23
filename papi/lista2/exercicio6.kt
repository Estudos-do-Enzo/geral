package lista2

fun main() {
    var raio: Double
    while (true) {
        try {
            print("Digite o raio em centímetros, usando o ponto como separador decimal: ")
            val raioString = readLine() 
            raio = raioString!!.toDouble()
            break
        } catch (e: Exception) {
            println("Por favor, insira um valor válido para o raio, usando o ponto como separador decimal")
        }
    }
    val area = Math.PI * Math.pow(raio, 2.0)
    println("A área do círculo com um raio de $raio centímetros é $area")
}   