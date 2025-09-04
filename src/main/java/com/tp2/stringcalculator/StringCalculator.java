package com.tp2.stringcalculator;

public class StringCalculator {

    public int add(String input) {
        if (input == null || input.isEmpty()) return 0;

        String normalized = input.replace('\n', ',');
        String[] parts = normalized.split(",");

        int sum = 0;
        StringBuilder negatives = new StringBuilder();

        for (String token : parts) {
            token = token.trim();
            if (token.isEmpty()) continue;

            int value = Integer.parseInt(token);

            if (value < 0) {
                if (negatives.length() > 0) negatives.append(",");
                negatives.append(value);
            }
            sum += value;
        }

        if (negatives.length() > 0) {
            throw new IllegalArgumentException("Negatives not allowed: " + negatives);
        }

        return sum;
    }
}


