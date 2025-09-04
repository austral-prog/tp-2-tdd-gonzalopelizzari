package com.tp2.roman;

public class RomanNumerals {

    private static final int[]    VALUES  = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    private static final String[] SYMBOLS = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public String convert(int n) {
        if (n <= 0 || n > 3999) {
            throw new IllegalArgumentException("number out of range (1..3999): " + n);
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (n > 0) {
            while (n >= VALUES[i]) {
                n -= VALUES[i];
                sb.append(SYMBOLS[i]);
            }
            i++;
        }
        return sb.toString();
    }
}


