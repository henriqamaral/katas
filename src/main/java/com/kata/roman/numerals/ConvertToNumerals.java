package com.kata.roman.numerals;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class ConvertToNumerals {

  private Pattern romanNumeralPattern = Pattern.compile("M|CM|D|CD|C|XC|L|XL|X|IX|V|IV|I");
  public static final String[] ROMAN_NUMERALS = {
    "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
  };
    public static final int[] DECIMAL_VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

  public int toNumerals(String romanNumeral) {
    if (Objects.isNull(romanNumeral) || romanNumeral.isEmpty()) {
      return 0;
    }

    final Matcher romanNumeralMatcher = romanNumeralPattern.matcher(romanNumeral);

    int result = 0;

    while (romanNumeralMatcher.find()) {
      result += DECIMAL_VALUES[getRomanNumeralIndex(romanNumeralMatcher.group(0))];
    }

    return result;
  }

  private int getRomanNumeralIndex(String romanNumeral) {
    return IntStream.range(0, ROMAN_NUMERALS.length)
        .filter(index -> ROMAN_NUMERALS[index].equals(romanNumeral))
        .findFirst()
        .orElse(-1);
  }
}
