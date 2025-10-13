// 13.10.2025
// https://leetcode.com/problems/fraction-to-recurring-decimal/?envType=daily-question&envId=2025-10-13
// 166. Fraction to Recurring Decimal

import java.util.*;

public class M_166_FractionToRecurringDecimal {
    public static String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0)
            return "0";

        StringBuilder sb = new StringBuilder();

        if ((numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0)) {
            sb.append("-");
        }

        long num = (long) Math.abs((long) numerator);
        long den = (long) Math.abs((long) denominator);

        sb.append(num / den); // Integer part
        long rem = num % den;

        if (rem == 0)
            return sb.toString();

        sb.append(".");

        // fractional part
        Map<Long, Integer> map = new HashMap<>();
        while (rem != 0) {
            if (map.containsKey(rem)) {
                int index = map.get(rem);
                sb.insert(index, "(");
                sb.append(")");
                break;
            }

            map.put(rem, sb.length());

            rem = rem * 10;
            sb.append(rem / den);
            rem = rem % den;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int n1 = 1;
        int d1 = 2;
        System.out.println(fractionToDecimal(n1, d1));

        int n2 = 2;
        int d2 = 1;
        System.out.println(fractionToDecimal(n2, d2));

        int n3 = 4;
        int d3 = 333;
        System.out.println(fractionToDecimal(n3, d3));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// M_166_FractionToRecurringDecimal.java && java
// M_166_FractionToRecurringDecimal && del
// M_166_FractionToRecurringDecimal.class
// 0.5
// 2
// 0.(012)
