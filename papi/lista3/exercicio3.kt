package lista3

fun main() {
    print("Por favor informe um texto a ser revertido: ")
    val texto = readLine()!!
    print("O texto revertido é: ")
    println(texto.reversed())
}