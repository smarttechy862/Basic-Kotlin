fun main(args: Array<String>) {

    val year = 1900
    var leap = false

    if (year % 4 == 0) {
        if (year % 100 == 0) {
            // year is divisible by 400, hence the year is a leap year
            leap = year % 400 == 0
        } else
            leap = true
    }

    println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}
