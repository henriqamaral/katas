package com.kata.roman.numerals

class ConvertToRomanNumeralsK {

    private val ones = arrayOf("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")
    private val tens = arrayOf("X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")
    private val hundreds = arrayOf("C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")
    private val thousand = "M"

    fun parseFromDecimals(number: Int): String {

        return number
                .takeIf { it > 0 }
                ?.let {
                    getThousands(calculate(it, 1000))
                            .plus(getHundreds(calculate(it, 100)))
                            .plus(getTens(calculate(it, 10)))
                            .plus(getOnes(calculate(it, 1)))
                }
                ?: let { "" }
    }

    private fun calculate(number: Int, i: Int) = number / i % 10

    private fun getThousands(number: Int) = (0 until number).joinToString("") { thousand }

    private fun getHundreds(number: Int) = getNumerals(number, hundreds)

    private fun getTens(number: Int) = getNumerals(number, tens)

    private fun getOnes(number: Int) = getNumerals(number, ones)

    private fun getNumerals(number: Int, values: Array<String>): String {
        return (0..values.size).filter { value -> value == number - 1 }.joinToString("") { value -> values[value] }
    }
}