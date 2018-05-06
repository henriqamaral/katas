package com.kata.roman.numerals

import org.junit.Assert.assertEquals
import org.junit.Test

class ConvertToRomanNumeralsKTest {

    private val convertToRomanNumeralsK = ConvertToRomanNumeralsK()

    @Test
    fun `convert Numeral Less Than Ten`() {

        assertEquals("", convertToRomanNumeralsK.parseFromDecimals(0))
        assertEquals("", convertToRomanNumeralsK.parseFromDecimals(-1))
        assertEquals("I", convertToRomanNumeralsK.parseFromDecimals(1))
        assertEquals("II", convertToRomanNumeralsK.parseFromDecimals(2))
        assertEquals("III", convertToRomanNumeralsK.parseFromDecimals(3))
        assertEquals("IV", convertToRomanNumeralsK.parseFromDecimals(4))
        assertEquals("V", convertToRomanNumeralsK.parseFromDecimals(5))
        assertEquals("VI", convertToRomanNumeralsK.parseFromDecimals(6))
        assertEquals("VII", convertToRomanNumeralsK.parseFromDecimals(7))
        assertEquals("VIII", convertToRomanNumeralsK.parseFromDecimals(8))
        assertEquals("IX", convertToRomanNumeralsK.parseFromDecimals(9))
    }

    @Test
    fun `convert Numeral Less Than One Hundred`() {

        assertEquals("XI", convertToRomanNumeralsK.parseFromDecimals(11))
        assertEquals("XII", convertToRomanNumeralsK.parseFromDecimals(12))
        assertEquals("XIII", convertToRomanNumeralsK.parseFromDecimals(13))
        assertEquals("XIV", convertToRomanNumeralsK.parseFromDecimals(14))
        assertEquals("XXV", convertToRomanNumeralsK.parseFromDecimals(25))
        assertEquals("XXIII", convertToRomanNumeralsK.parseFromDecimals(23))
        assertEquals("XCVII", convertToRomanNumeralsK.parseFromDecimals(97))
        assertEquals("LXIX", convertToRomanNumeralsK.parseFromDecimals(69))
    }

    @Test
    fun `convert Numeral Less Than One Thousand`() {

        assertEquals("CII", convertToRomanNumeralsK.parseFromDecimals(102))
        assertEquals("DLV", convertToRomanNumeralsK.parseFromDecimals(555))
        assertEquals("DCLXVI", convertToRomanNumeralsK.parseFromDecimals(666))
        assertEquals("DCCLXXV", convertToRomanNumeralsK.parseFromDecimals(775))
        assertEquals("DCCCLIV", convertToRomanNumeralsK.parseFromDecimals(854))
    }

    @Test
    fun `convert Thousand`() {

        assertEquals("MXXXIII", convertToRomanNumeralsK.parseFromDecimals(1033))
        assertEquals("M", convertToRomanNumeralsK.parseFromDecimals(1000))
        assertEquals("MMXVII", convertToRomanNumeralsK.parseFromDecimals(2017))
        assertEquals("MMMXXI", convertToRomanNumeralsK.parseFromDecimals(3021))
        assertEquals("MMMMDI", convertToRomanNumeralsK.parseFromDecimals(4501))
        assertEquals("MMMMMMMMMCMXCIX", convertToRomanNumeralsK.parseFromDecimals(9999))
    }
}