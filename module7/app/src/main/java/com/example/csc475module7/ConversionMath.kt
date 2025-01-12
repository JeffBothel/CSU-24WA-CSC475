package com.example.csc475module7

fun convertFahrenheitToCelsius(fahrenheit: Double): Double {
    return (fahrenheit - 32) * 5 / 9
}

fun convertCelsiusToFahrenheit(celsius: Double): Double {
    return celsius * 9 / 5 + 32
}

fun convertMilesToKilometers(miles: Double): Double {
    return miles * 1.60934
}

fun convertKilometersToMiles(kilometers: Double): Double {
    return kilometers / 1.60934
}

fun convertPoundsToKilograms(pounds: Double): Double {
    return pounds * 0.453592
}

fun convertKilogramsToPounds(kilograms: Double): Double {
    return kilograms / 0.453592
}

fun convertInchesToCentimeters(inches: Double): Double {
    return inches * 2.54
}

fun convertCentimetersToInches(centimeters: Double): Double {
    return centimeters / 2.54
}

fun convertFeetToMeters(feet: Double): Double {
    return feet * 0.3048
}

fun convertMetersToFeet(meters: Double): Double {
    return meters / 0.3048
}

fun convertYardsToMeters(yards: Double): Double {
    return yards * 0.9144
}

fun convertMetersToYards(meters: Double): Double {
    return meters / 0.9144
}