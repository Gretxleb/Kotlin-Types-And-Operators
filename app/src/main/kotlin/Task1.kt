fun main() {
    calculateCommission(1000.0)
    calculateCommission(50000.0)
}

fun calculateCommission(amount: Double) {
    val commissionRate = 0.0075
    val minCommission = 35.0

    val calculatedCommission = amount * commissionRate

    val finalCommission = maxOf(calculatedCommission, minCommission)

    println("--- Денежный перевод ---")
    println("Сумма перевода: ${amount.toInt()} руб.")
    println("Итоговая комиссия: ${String.format("%.2f", finalCommission)} руб.")
    println("------------------------")
}