package com.kata.roman.numerals

class ConvertToNumeralsK {

    private val romanNumeralPattern = "M|CM|D|CD|C|XC|L|XL|X|IX|V|IV|I"
    private val romanNumerals = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
    private val decimalValues = intArrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)

    fun toNumerals(romanNumeral: String?): Int {
        return romanNumeral
                .takeIf { it != null && it != "" }
                ?.let {
                    transformToNumerals(it)
                }
                ?: let { 0 }
    }

    private fun transformToNumerals(romanNumeral: String): Int {
        return romanNumeralPattern.toRegex()
                .findAll(romanNumeral)
                .map { matchResult -> getRomanNumeralPosition(matchResult.value) }
                .map { decimalValues[it] }
                .sum()
    }

    private fun getRomanNumeralPosition(romanNumeral: String): Int {
        return (0..romanNumerals.size).first { index -> romanNumerals[index] == romanNumeral }
    }
}