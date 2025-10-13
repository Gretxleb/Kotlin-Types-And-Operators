fun main() {
    printLikes(1)
    printLikes(11)
    printLikes(21)
    printLikes(12)
    printLikes(105)
}

fun printLikes(likes: Int) {

    val lastTwoDigits = likes % 100
    val lastDigit = likes % 10

    val isException = lastTwoDigits in 11..14

    val isSingle = (lastDigit == 1) && !isException

    val word = if (isSingle) {
        "человеку"
    } else {
        "людям"
    }

    println("Понравилось $likes $word.")
}