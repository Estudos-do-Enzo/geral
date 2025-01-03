package lista1

fun main() {
    var numeroPrincipal = 0
    while (true) {
        try {
            print("Por favor digie um número: ")
            numeroPrincipal = readLine()!!.toInt()
            break
        } catch (e: NumberFormatException) {
            println("Por favor, digite um número válido.")
        }
    }    

    var numeroSecundario = 1
    while (numeroSecundario < 11) {
        print("$numeroPrincipal x $numeroSecundario = ")
        println(numeroPrincipal * numeroSecundario)
        numeroSecundario += 1
    }
}