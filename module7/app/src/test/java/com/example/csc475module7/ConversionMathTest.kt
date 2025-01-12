package com.example.csc475module7

import org.junit.Assert.*

import org.junit.Test

class ConversionMathKtTest {
    val deltaValue: Double = 0.00001

    @Test
    fun convertFahrenheitToCelsius() {
        assertEquals(37.7777778, convertFahrenheitToCelsius(100.0), deltaValue)
        assertEquals(65.6788889, convertFahrenheitToCelsius(150.222), deltaValue)
    }

    @Test
    fun convertCelsiusToFahrenheit() {
        assertEquals(212.0, convertCelsiusToFahrenheit(100.0), deltaValue)
        assertEquals(302.3999999999999, convertCelsiusToFahrenheit(150.222), deltaValue)
    }

    @Test
    fun convertMilesToKilometers() {
        assertEquals(160.9344, convertMilesToKilometers(100.0), deltaValue)
        assertEquals(241.758874, convertMilesToKilometers(150.222), deltaValue)
    }

    @Test
    fun convertKilometersToMiles() {
        assertEquals(62.1371192, convertKilometersToMiles(100.0), deltaValue)
        assertEquals(93.3436232, convertKilometersToMiles(150.222), deltaValue)
    }

    @Test
    fun convertPoundsToKilograms() {
        assertEquals(45.359237, convertPoundsToKilograms(100.0), deltaValue)
        assertEquals(68.1395529, convertPoundsToKilograms(150.222), deltaValue)
    }

    @Test
    fun convertKilogramsToPounds() {
        assertEquals(220.462262, convertKilogramsToPounds(100.0), deltaValue)
        assertEquals(331.182819, convertKilogramsToPounds(150.222), deltaValue)
    }

    @Test
    fun convertInchesToCentimeters() {
        assertEquals(254.0, convertInchesToCentimeters(100.0), deltaValue)
        assertEquals(381.56388, convertInchesToCentimeters(150.222), deltaValue)
    }

    @Test
    fun convertCentimetersToInches() {
        assertEquals(39.3700787, convertCentimetersToInches(100.0), deltaValue)
        assertEquals(59.1425197, convertCentimetersToInches(150.222), deltaValue)
    }

    @Test
    fun convertFeetToMeters() {
        assertEquals(30.48, convertFeetToMeters(100.0), deltaValue)
        assertEquals(45.7876656, convertFeetToMeters(150.222), deltaValue)
    }

    @Test
    fun convertMetersToFeet() {
        assertEquals(328.08399, convertMetersToFeet(100.0), deltaValue)
        assertEquals(492.854331, convertMetersToFeet(150.222), deltaValue)
    }

    @Test
    fun convertYardsToMeters() {
        assertEquals(91.44, convertYardsToMeters(100.0), deltaValue)
        assertEquals(137.362997, convertYardsToMeters(150.222), deltaValue)
    }

    @Test
    fun convertMetersToYards() {
        assertEquals(109.36133, convertMetersToYards(100.0), deltaValue)
        assertEquals(164.284777, convertMetersToYards(150.222), deltaValue)
    }
}