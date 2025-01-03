package lista1

fun main() {
    var temperaturaFarenheit: Double = 0.0 
	while (true) {
        try {
            print("Digite a temperatura em Farenheit: ")
            var input = readLine()
            temperaturaFarenheit = input!!.toDouble()
            break
        } catch (e: NumberFormatException) {
            println("Por favor, digite um valor numérico, com um ponto como separador decimal.")
        }
    }

    println("A temperatura em Farenheit digitada foi: $temperaturaFarenheit")
    val temperaturaCelsius = (5 * (temperaturaFarenheit-32) / 9)
    println("A temperatura equivalente em celsius é: $temperaturaCelsius")
        
}