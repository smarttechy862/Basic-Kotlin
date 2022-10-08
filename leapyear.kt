fun main(args: Array<String>) {

    val year = 1900
    var leap = false

    if (year % 4 == 0) {
        if (year % 100 == 0) {
            // year is divisible by 400, hence the year is a leap year
            leap = year % 400 == 0
        } else
            leap = true
    } else
        leap = false

    println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}

Kotlin Program to Check Leap Year using when expression
fun main(args: Array<String>) {

    val year = 2012
    var leap = false

    leap = when {
        year % 4 == 0 -> {
            when {
                year % 100 == 0 -> year % 400 == 0
                else -> true
            }
        }
        else -> false
    }

    println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}
