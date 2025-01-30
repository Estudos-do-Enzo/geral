package lista2

import java.text.DecimalFormat
import java.util.Locale

fun formatBrazilianCurrency(value: Double) : String {
    val moeda = DecimalFormat.getCurrencyInstance(Locale("pt", "BR"))
    return moeda.format(value).replace(moeda.currency.currencyCode, moeda.currency.currencyCode + " ")
}

fun main() {
    var peso: Double
    while (true) {
        try {
            print("Por favor digite o peso dos peixes, usando o ponto como separador decimal: ")
            val pesoString = readLine()
            peso = pesoString!!.toDouble()
            break
        } catch (e: NumberFormatException) {
            println("Erro: valor inválido. Por favor, digite um valor numérico, usando o ponto como o separador decimal.")
        }
    }

    var pesoExcedenteDouble: Double = peso - 50
    if (pesoExcedenteDouble < 0) {
        pesoExcedenteDouble = 0.0
    }
    val pesoExcedenteString: String = pesoExcedenteDouble.toBigDecimal().toPlainString().replace(".", ",")
    val valorExcedente = formatBrazilianCurrency(pesoExcedenteDouble * 4)

    println("O peso excedente é: $pesoExcedenteString kg")
    println("O valor a ser pago é: $valorExcedente")
}

