fun main() {
    val userTime = 345789

    agoToText(userTime)

}
fun agoToText(userTime: Int) {
    when {
        userTime <= 60 -> println("был(а) только что")
        userTime > 60 && userTime < 60 * 60 -> agoToTextMinutes(userTime)
        userTime > 60 * 60 + 1 && userTime < 24 * 60 * 60 -> agoToTextHours(userTime)
        userTime >= 24 * 60 * 60 + 1 && userTime < 2 * 24 * 60 * 60 -> println("был(а) сегодня")
        userTime >= 2 * 24 * 60 * 60 && userTime < 3 * 24 * 60 * 60 -> println("был(а) вчера")
        userTime >= 3 * 24 * 60 * 60 -> println("был(а) давно")
    }
}

fun agoToTextMinutes (userTime: Int) {

    var userTimeMinutes = userTime / 60

    if (userTimeMinutes%10 == 1 && userTimeMinutes%100 != 11) println("был " + userTimeMinutes + " минуту назад")
    else if (userTimeMinutes%10 > 1 && userTimeMinutes%10 < 5 ) println("был " + userTimeMinutes + " минуты назад")
    else if (userTimeMinutes%10 >= 5 || userTimeMinutes%10 <= 1) println("был " + userTimeMinutes + " минут назад")

}

fun agoToTextHours (userTime: Int) {

    var userTimeHours = userTime / (60 * 60)

    if (userTimeHours%10 == 1 && userTimeHours%100 != 11) println("был " + userTimeHours + " час назад")
    else if (userTimeHours%10 > 1 && userTimeHours%10 < 5) println("был " + userTimeHours + " часа назад")
    else if (userTimeHours%10 >= 5 || userTimeHours%10 <= 1) println("был " + userTimeHours + " часов назад")

}