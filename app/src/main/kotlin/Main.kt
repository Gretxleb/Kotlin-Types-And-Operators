import kotlin.math.roundToInt

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("==================================================")
            println("Домашнее задание: 1.2. Отличия от Java")
            println("Исполнитель: Paul Sengel") 
            println("==================================================")

            println("\n--- Задача №1. Денежные переводы ---")
            task1MoneyTransfer()
            
            println("\n--- Задача №2. Люди/Человеки ---")
            task2PeopleLikes()
            
            println("\n--- Задача №3. Меломан ---")
            task3MelomanDiscount()
        }
    }
}

fun task1MoneyTransfer() {
    val amount = 50000.00 
    val minCommission = 35.00 
    val commissionRate = 0.0075 

    val nominalCommission = amount * commissionRate

    val commission = maxOf(nominalCommission, minCommission)

    println("Сумма перевода: $amount руб.")
    println("Размер комиссии: ${"%.2f".format(commission)} руб.")
}


fun task2PeopleLikes() {
    val likes = 111 

    val lastDigit = likes % 10
    val lastTwoDigits = likes % 100

    val isCheloveku = (lastDigit == 1) && (lastTwoDigits != 11)

    val wordForm = if (isCheloveku) {
        "человеку"
    } else {
        "людям"
    }

    println("Лайки: $likes")
    println("Понравилось $likes $wordForm.")
}


fun task3MelomanDiscount() {
    val purchaseAmount = 15000.00 
    val isRegularCustomer = true 

    val standardDiscount: Double = when {
        purchaseAmount in 0.0..1000.0 -> 0.0 
        purchaseAmount in 1000.01..10000.0 -> 100.0 
        purchaseAmount > 10000.0 -> purchaseAmount * 0.05 
        else -> 0.0
    }

    var priceAfterDiscount = purchaseAmount - standardDiscount
    
    if (isRegularCustomer) {
        priceAfterDiscount *= 0.99 
    }

    val finalPrice = priceAfterDiscount.roundToInt()

    println("Сумма покупки: $purchaseAmount руб.")
    println("Статус: ${if (isRegularCustomer) "Постоянный покупатель" else "Обычный покупатель"}")
    println("Скидка: $standardDiscount руб. (плюс 1% доп. скидки)")
    println("Итоговая стоимость: $finalPrice руб. (округлено)")
}
