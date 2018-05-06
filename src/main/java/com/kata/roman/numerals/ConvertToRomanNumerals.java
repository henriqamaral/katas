package com.kata.roman.numerals;

import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;

public class ConvertToRomanNumerals {


    public static final String ONES[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    public static final String TENS[] = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    public static final String HUNDREDS[] = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    public static final String THOUSAND = "M";

    public String parseFromDecimals(final int decimalValue) {

        if (decimalValue == 0) {
            return "";
        }
        return getThousands(calculate(decimalValue, 1000))
                .concat(getHundreds(calculate(decimalValue, 100)))
                .concat(getTens(calculate(decimalValue, 10)))
                .concat(getOnes(decimalValue % 10));
    }

    private int calculate(final int decimalValue, final int i) {
        return decimalValue / i % 10;
    }

    private String getThousands(int thousands) {
        return IntStream.range(0, thousands).mapToObj(i -> THOUSAND).collect(joining());
    }

    private String getHundreds(final int hundreds) {
        return getNumerals(hundreds, HUNDREDS);
    }

    private String getTens(final int tens) {
        return getNumerals(tens, TENS);
    }

    private String getOnes(final int ones) {
        return getNumerals(ones, ONES);
    }

    private String getNumerals(final int tens, final String[] values) {
        return IntStream.range(0, values.length).filter(value -> value == tens - 1).mapToObj(value -> values[value]).collect(joining());
    }
}
