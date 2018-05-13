package com.kata.roman.numerals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ConvertToNumeralsTest {

    private ConvertToNumerals convertToNumerals = new ConvertToNumerals();

    @Test
    public void toNumeralsWhenStringIsNullOrEmpty() {
        Assert.assertEquals(0, convertToNumerals.toNumerals(""));
        Assert.assertEquals(0, convertToNumerals.toNumerals(null));
    }

    @Test
    public void toNumeralsWhenStringIsLessThanTen() {
        Assert.assertEquals(1, convertToNumerals.toNumerals("I"));
        Assert.assertEquals(2, convertToNumerals.toNumerals("II"));
        Assert.assertEquals(3, convertToNumerals.toNumerals("III"));
        Assert.assertEquals(4, convertToNumerals.toNumerals("IV"));
        Assert.assertEquals(5, convertToNumerals.toNumerals("V"));
        Assert.assertEquals(6, convertToNumerals.toNumerals("VI"));
        Assert.assertEquals(9, convertToNumerals.toNumerals("IX"));
    }

    @Test
    public void toNumeralsWhenStringIsLessThanOneHundred() {
        Assert.assertEquals(40, convertToNumerals.toNumerals("XL"));
        Assert.assertEquals(55, convertToNumerals.toNumerals("LV"));
        Assert.assertEquals(62, convertToNumerals.toNumerals("LXII"));
        Assert.assertEquals(99, convertToNumerals.toNumerals("XCIX"));
    }

    @Test
    public void toNumeralsWhenStringIsLessThanOneThousand() {
        Assert.assertEquals(555, convertToNumerals.toNumerals("DLV"));
        Assert.assertEquals(666, convertToNumerals.toNumerals("DCLXVI"));
        Assert.assertEquals(875, convertToNumerals.toNumerals("DCCCLXXV"));
    }

    @Test
    public void toNumeralsWhenStringIsLessThanFourThousand() {
        Assert.assertEquals(2547, convertToNumerals.toNumerals("MMDXLVII"));
        Assert.assertEquals(3999, convertToNumerals.toNumerals("MMMCMXCIX"));
        Assert.assertEquals(1574, convertToNumerals.toNumerals("MDLXXIV"));
    }

}