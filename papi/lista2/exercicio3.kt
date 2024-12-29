//Click on Submit and Next to continue 

fun main(args : Array<String>) {
    var numero1: Int
    var numero2: Int

    while (true) {
        try {
            print("Por favor digite o primeiro número: ") 
            val input = readLine()
            numero1 = input!!.toInt()
            break
        } catch (e : Exception) {
            println("Erro na conversão para número. Por favor tente novamente")
        }
    }

    while (true) {
        try {
            print("Por favor digite o segundo número: ") 
            val input = readLine()
            numero2 = input!!.toInt()
            break
        } catch (e : Exception) {
            println("Erro na conversão para número. Por favor tente novamente")
        }
    }

    print("A soma é: ")
    println(numero1 + numero2)
}