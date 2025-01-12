package com.example.csc475module7

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Variables that allow working with the inputText and outputConversion EditTexts
        val inputText = findViewById<TextInputEditText>(R.id.inputText)
        val outputConversion = findViewById<EditText>(R.id.outputConversion)

        inputText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val pattern = Pattern.compile("^(?<number>[[:digit:]]+(|\\.[[:digit:]]*))\\s(?<units>[[:alpha:]]+)\$")
                val matcher = pattern.matcher(s.toString())
                if (matcher.matches()) {
                    val number = matcher.group("number").toDouble()
                    val units = matcher.group("units")
                    val decimals = 4 // Number of decimal places to round to
                    outputConversion.setText("Number: $number, Units: $units")
                    when(units) {
                        "f" -> {
                            val result = convertFahrenheitToCelsius(number)
                            outputConversion.setText("$number F = ${"%.${decimals}f".format(result)} C")
                        }
                        "F" -> {
                            val result = convertFahrenheitToCelsius(number)
                            outputConversion.setText("$number F = ${"%.${decimals}f".format(result)} C")
                        }
                        "c" -> {
                            val result = convertCelsiusToFahrenheit(number)
                            outputConversion.setText("$number C = ${"%.${decimals}f".format(result)} F")
                        }
                        "C" -> {
                            val result = convertCelsiusToFahrenheit(number)
                            outputConversion.setText("$number C = ${"%.${decimals}f".format(result)} F")
                        }
                        "mi" -> {
                            val result = convertMilesToKilometers(number)
                            outputConversion.setText("$number mi = ${"%.${decimals}f".format(result)} km")
                        }
                        "km" -> {
                            val result = convertKilometersToMiles(number)
                            outputConversion.setText("$number km = ${"%.${decimals}f".format(result)} mi")
                        }
                        "lb" -> {
                            val result = convertPoundsToKilograms(number)
                            outputConversion.setText("$number lb = ${"%.${decimals}f".format(result)} kg")
                        }
                        "kg" -> {
                            val result = convertKilogramsToPounds(number)
                            outputConversion.setText("$number kg = ${"%.${decimals}f".format(result)} lb")
                        }
                        "in" -> {
                            val result = convertInchesToCentimeters(number)
                            outputConversion.setText("$number in = ${"%.${decimals}f".format(result)} cm")
                        }
                        "cm" -> {
                            val result = convertCentimetersToInches(number)
                            outputConversion.setText("$number cm = ${"%.${decimals}f".format(result)} in")
                        }
                        "ft" -> {
                            val result = convertFeetToMeters(number)
                            outputConversion.setText("$number ft = ${"%.${decimals}f".format(result)} m")
                        }
                        "m" -> {
                            val result = convertMetersToFeet(number)
                            outputConversion.setText("$number m = ${"%.${decimals}f".format(result)} ft")
                        }
                        "yd" -> {
                            val result = convertYardsToMeters(number)
                            outputConversion.setText("$number yd = ${"%.${decimals}f".format(result)} m")
                        }
                        else -> {
                            outputConversion.setText("Invalid units")
                        }
                    }
                } else {
                    outputConversion.setText("Invalid input")
                }
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }
}