package com.kata.roman.numerals

import org.junit.Assert
import org.junit.jupiter.api.Test

internal class ConvertToNumeralsKTest {

    private val convertToNumeralsK = ConvertToNumeralsK()

    @Test
    fun `to Numerals when String is null or empty`() {
        Assert.assertEquals(0, convertToNumeralsK.toNumerals(""))
        Assert.assertEquals(0, convertToNumeralsK.toNumerals(null))
    }

    @Test
    fun `to Numerals when Roman Numerals is less Than Ten`() {
        Assert.assertEquals(1, convertToNumeralsK.toNumerals("I"))
        Assert.assertEquals(2, convertToNumeralsK.toNumerals("II"))
        Assert.assertEquals(3, convertToNumeralsK.toNumerals("III"))
        Assert.assertEquals(4, convertToNumeralsK.toNumerals("IV"))
        Assert.assertEquals(5, convertToNumeralsK.toNumerals("V"))
        Assert.assertEquals(6, convertToNumeralsK.toNumerals("VI"))
        Assert.assertEquals(9, convertToNumeralsK.toNumerals("IX"))
    }

    @Test
    fun `to Numerals when Roman Numerals is less Than One Hundred`() {
        Assert.assertEquals(40, convertToNumeralsK.toNumerals("XL"))
        Assert.assertEquals(55, convertToNumeralsK.toNumerals("LV"))
        Assert.assertEquals(62, convertToNumeralsK.toNumerals("LXII"))
        Assert.assertEquals(99, convertToNumeralsK.toNumerals("XCIX"))
    }

    @Test
    fun `to Numerals when Roman Numerals is less Than One Thousand`() {
        Assert.assertEquals(555, convertToNumeralsK.toNumerals("DLV"))
        Assert.assertEquals(666, convertToNumeralsK.toNumerals("DCLXVI"))
        Assert.assertEquals(875, convertToNumeralsK.toNumerals("DCCCLXXV"))
    }

    @Test
    fun `to Numerals when Roman Numerals is less Than four Thousand`() {
        Assert.assertEquals(2547, convertToNumeralsK.toNumerals("MMDXLVII"))
        Assert.assertEquals(3999, convertToNumeralsK.toNumerals("MMMCMXCIX"))
        Assert.assertEquals(1574, convertToNumeralsK.toNumerals("MDLXXIV"))
    }
}