package com.kata.roman.numerals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ConvertToRomanNumeralsTest {

    private ConvertToRomanNumerals convertToRomanNumerals;

    @Before
    public void init() {
        convertToRomanNumerals = new ConvertToRomanNumerals();
    }

    @Test
    public void convertNumeralLessThanTen() {

        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(1), "I");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(2), "II");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(3), "III");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(4), "IV");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(5), "V");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(6), "VI");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(7), "VII");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(8), "VIII");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(9), "IX");

    }

    @Test
    public void convertNumeralLessThanOneHundred() {
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(10), "X");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(20), "XX");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(30), "XXX");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(40), "XL");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(50), "L");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(60), "LX");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(70), "LXX");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(80), "LXXX");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(90), "XC");
    }

    @Test
    public void convertRandomNumeralLessThanOneHundred() {
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(11), "XI");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(12), "XII");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(13), "XIII");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(14), "XIV");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(25), "XXV");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(23), "XXIII");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(97), "XCVII");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(69), "LXIX");
    }

    @Test
    public void convertRandomNumeralLessThanOneThousand() {
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(102), "CII");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(555), "DLV");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(666), "DCLXVI");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(775), "DCCLXXV");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(854), "DCCCLIV");
    }

    @Test
    public void convertRandomNumeralsThousand() {
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(1033), "MXXXIII");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(1000), "M");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(2017), "MMXVII");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(3021), "MMMXXI");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(4501), "MMMMDI");
        Assert.assertEquals(convertToRomanNumerals.parseFromDecimals(9999), "MMMMMMMMMCMXCIX");
    }

}
