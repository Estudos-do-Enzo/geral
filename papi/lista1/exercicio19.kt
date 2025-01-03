package lista1

fun main() {
    var numeroPrincipal: Int = 0
    var numeroSecundario: Int

    while (numeroPrincipal < 11) {
        numeroSecundario = 1
        while (numeroSecundario < 11) {
            print("$numeroPrincipal x $numeroSecundario = ")
            println(numeroPrincipal * numeroSecundario)
            numeroSecundario += 1
        }
        println("-------------------")
        numeroPrincipal += 1
    }
}