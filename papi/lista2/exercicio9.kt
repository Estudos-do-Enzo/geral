package lista2

fun main() {
    var temperaturaFarenheit: Double
    while (true) {
        try {
            print("Digite a temperatura em Farenheit, usando o ponto como separador decimal: ")
            val temperaturaFarenheitString = readLine() 
            temperaturaFarenheit = temperaturaFarenheitString!!.toDouble()
            break
        } catch (e: Exception) {
            println("Por favor, insira um valor válido para a temperatura em Farenheit, usando o ponto como separador decimal")
        }
    }
    val temperaturaCelsius = 5 * (temperaturaFarenheit - 32) / 9
    println("A temperatura equivalente em Celsius é $temperaturaCelsius")
}   