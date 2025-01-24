package lista2

import java.math.RoundingMode
import java.text.NumberFormat
import java.util.Locale
import java.text.DecimalFormat

fun main() {
    var valorHora: Double = 0.0
    var horasTrabalhadasMes: Double = 0.0

    while (true) {
        try {
            print("Digite o seu valor hora em reais, usando o ponto como separador decimal: ")
            valorHora = readLine()!!.toDouble()
            if (valorHora <= 0) {
                throw Exception()
            }
            break
        } catch (e: Exception) {
            println("Por favor informe um número válido maior que zero")
        }
    }
    
    while(true) {
        try {
            print("Digite o número de horas trabalhadas no mês, usando o ponto como separador decimal: ")
            horasTrabalhadasMes = readLine()!!.toDouble()
            if (horasTrabalhadasMes <= 0) {
                throw Exception()
            }
            break                    
        } catch (e: Exception) {
            println("Por favor informe um número válido maior que zero")
        }   
    }

    var rendimentoMensal: Double = (valorHora * horasTrabalhadasMes).toBigDecimal().setScale(2, RoundingMode.UP).toDouble()
    val formatter:NumberFormat = DecimalFormat("#0.00");
    val myLocale:Locale = Locale("pt", "BR")
    var rendimentoMensalFormatado = NumberFormat.getNumberInstance(myLocale).format(rendimentoMensal)

    // Ajustando o número de dígitos depois da vírgula para sempre ficarmos
    // sempre com 2 números depois da vírgula
    val posicaoVirgula = rendimentoMensalFormatado.indexOf(",",0)
    if (posicaoVirgula == -1) {
        rendimentoMensalFormatado += ",00"
    } else if (posicaoVirgula == rendimentoMensalFormatado.length - 2 ) {
        rendimentoMensalFormatado += "0"
    }

    print("O rendimento no mês foi: R$")
    println(rendimentoMensalFormatado)
}