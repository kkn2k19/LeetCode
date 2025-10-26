// 26.10.2025
// https://leetcode.com/problems/remove-zeros-in-decimal-representation/description/
// 3726. Remove Zeros in Decimal Representation

import java.util.*;

public class E_3726_RemoveZeroesInDecimalRepresentation {
    public static long removeZeros(long n) {
        StringBuilder sb = new StringBuilder("");
        while (n > 0) {
            int d = (int) (n % 10);
            if (d != 0) {
                sb.append(d);
            }
            n /= 10;
        }
        return Long.parseLong(sb.reverse().toString());
    }

    public static void main(String[] args) {
        long n1 = 1020030;
        System.out.println(removeZeros(n1));

        long n2 = 1;
        System.out.println(removeZeros(n2));
    }
}

// E:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_3726_RemoveZeroesInDecimalRepresentation.java && java
// E_3726_RemoveZeroesInDecimalRepresentation && del
// E_3726_RemoveZeroesInDecimalRepresentation.class
// 123
// 1