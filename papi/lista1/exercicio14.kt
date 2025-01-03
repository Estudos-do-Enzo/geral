package lista1

fun main() {
    println("Iremos trocar 2 valores")
    print("Por favor, digite o primeiro valor: ")
    var valor1 = readLine()!!
    print("Por favor, digite o segundo valor: ")
    var valor2 = readLine()!!
    var tmp = valor2
    valor2 = valor1
    valor1 = tmp
    println("Após a troca, o primeiro valor passou a ser $valor1")
    println("E o segundo valor passou a ser $valor2")
}