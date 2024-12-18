package org.example.lesson1

fun main() {
    val secondsTotal: Int = 6360
    val hourToSeconds: Int  = 3600
    val minuteToSeconds: Int = 60

    val hoursInSpace: Int = secondsTotal / hourToSeconds
    val minutesInSpace: Int = (secondsTotal % hourToSeconds) / minuteToSeconds
    val secondsInSpace: Int = secondsTotal % minuteToSeconds

    val formattedHours = String.format("%02d", hoursInSpace)
    val formattedMinutes = String.format("%02d", minutesInSpace)
    val formattedSeconds = String.format("%02d", secondsInSpace)

    print("$formattedHours:$formattedMinutes:$formattedSeconds")

}