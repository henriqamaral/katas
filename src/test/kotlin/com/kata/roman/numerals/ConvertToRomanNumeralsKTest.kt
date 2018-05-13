package com.kata.roman.numerals

import org.junit.Assert.assertEquals
import org.junit.Test

class ConvertToRomanNumeralsKTest {

    private val convertToRomanNumeralsK = ConvertToRomanNumeralsK()

    @Test
    fun `convert Numeral Less Than Ten`() {

        assertEquals("", convertToRomanNumeralsK.toRomanNumerals(0))
        assertEquals("", convertToRomanNumeralsK.toRomanNumerals(-1))
        assertEquals("I", convertToRomanNumeralsK.toRomanNumerals(1))
        assertEquals("II", convertToRomanNumeralsK.toRomanNumerals(2))
        assertEquals("III", convertToRomanNumeralsK.toRomanNumerals(3))
        assertEquals("IV", convertToRomanNumeralsK.toRomanNumerals(4))
        assertEquals("V", convertToRomanNumeralsK.toRomanNumerals(5))
        assertEquals("VI", convertToRomanNumeralsK.toRomanNumerals(6))
        assertEquals("VII", convertToRomanNumeralsK.toRomanNumerals(7))
        assertEquals("VIII", convertToRomanNumeralsK.toRomanNumerals(8))
        assertEquals("IX", convertToRomanNumeralsK.toRomanNumerals(9))
    }

    @Test
    fun `convert Numeral Less Than One Hundred`() {

        assertEquals("XI", convertToRomanNumeralsK.toRomanNumerals(11))
        assertEquals("XII", convertToRomanNumeralsK.toRomanNumerals(12))
        assertEquals("XIII", convertToRomanNumeralsK.toRomanNumerals(13))
        assertEquals("XIV", convertToRomanNumeralsK.toRomanNumerals(14))
        assertEquals("XXV", convertToRomanNumeralsK.toRomanNumerals(25))
        assertEquals("XXIII", convertToRomanNumeralsK.toRomanNumerals(23))
        assertEquals("XCVII", convertToRomanNumeralsK.toRomanNumerals(97))
        assertEquals("LXIX", convertToRomanNumeralsK.toRomanNumerals(69))
    }

    @Test
    fun `convert Numeral Less Than One Thousand`() {

        assertEquals("CII", convertToRomanNumeralsK.toRomanNumerals(102))
        assertEquals("DLV", convertToRomanNumeralsK.toRomanNumerals(555))
        assertEquals("DCLXVI", convertToRomanNumeralsK.toRomanNumerals(666))
        assertEquals("DCCLXXV", convertToRomanNumeralsK.toRomanNumerals(775))
        assertEquals("DCCCLIV", convertToRomanNumeralsK.toRomanNumerals(854))
    }

    @Test
    fun `convert Thousand`() {

        assertEquals("MXXXIII", convertToRomanNumeralsK.toRomanNumerals(1033))
        assertEquals("M", convertToRomanNumeralsK.toRomanNumerals(1000))
        assertEquals("MMXVII", convertToRomanNumeralsK.toRomanNumerals(2017))
        assertEquals("MMMXXI", convertToRomanNumeralsK.toRomanNumerals(3021))
        assertEquals("MMMMDI", convertToRomanNumeralsK.toRomanNumerals(4501))
        assertEquals("MMMMMMMMMCMXCIX", convertToRomanNumeralsK.toRomanNumerals(9999))
    }
}