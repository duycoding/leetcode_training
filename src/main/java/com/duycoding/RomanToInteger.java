package com.duycoding;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            char next = (i + 1 < s.length()) ? s.charAt(i+1) : ' ';

            if (current == 'I' && next == 'V') {
                result += 4;
                i++;
            } else if (current == 'I' && next == 'X') {
                result += 9;
                i++;
            } else if (current == 'X' && next == 'L') {
                result += 40;
                i++;
            } else if (current == 'X' && next == 'C') {
                result += 90;
                i++;
            } else if (current == 'C' && next == 'D') {
                result += 400;
                i++;
            } else if (current == 'C' && next == 'M') {
                result += 900;
                i++;
            } else {
                if (current == 'I') result += 1;
                else if (current == 'V') result += 5;
                else if (current == 'X') result += 10;
                else if (current == 'L') result += 50;
                else if (current == 'C') result += 100;
                else if (current == 'D') result += 500;
                else result += 1000;
            }
        }

        return result;
    }
}
