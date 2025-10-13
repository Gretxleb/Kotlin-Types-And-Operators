import kotlin.math.round

fun main() {
    calculateFinalPrice(15000.0, true)
    calculateFinalPrice(500.0, false)
    calculateFinalPrice(5000.0, false)
    calculateFinalPrice(10500.0, true)
}

fun calculateFinalPrice(purchaseAmount: Double, isRegularCustomer: Boolean) {

    var discount = 0.0
    var finalPrice = purchaseAmount

    when (purchaseAmount) {
        in 0.0..1000.0 -> {
            discount = 0.0
        }
        in 1000.01..10000.0 -> {
            discount = 100.0
        }
        in 10000.01..Double.MAX_VALUE -> {
            discount = purchaseAmount * 0.05
        }
    }

    finalPrice -= discount

    if (isRegularCustomer) {
        val regularDiscountRate = 0.01

        finalPrice *= (1.0 - regularDiscountRate)
    }

    val finalPriceInt = round(finalPrice).toInt()

    println("--- Акция 'Меломан' ---")
    println("Сумма покупки: ${purchaseAmount.toInt()} руб.")
    println("Статус: ${if (isRegularCustomer) "Постоянный покупатель" else "Обычный покупатель"}")
    println("Базовая скидка: ${discount.toInt()} руб.")
    println("Итоговая стоимость: $finalPriceInt руб.")
    println("--------------------------")
}