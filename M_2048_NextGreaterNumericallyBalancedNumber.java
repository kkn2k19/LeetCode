// 24.10.2025
// https://leetcode.com/problems/next-greater-numerically-balanced-number/description/?envType=daily-question&envId=2025-10-24
// 2048. Next Greater Numerically Balanced Number

import java.util.*;

public class M_2048_NextGreaterNumericallyBalancedNumber {
    public static boolean containsZero(int n) {
        while (n > 0) {
            int d = n % 10;
            if (d == 0) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public static boolean isBalanced(int n) {
        if (containsZero(n)) {
            return false;
        }
        int[] freq = new int[10];
        int temp = n;
        while (temp > 0) {
            int d = temp % 10;
            freq[d] += 1;
            temp /= 10;
        }
        for (int i = 1; i <= 9; i++) {
            if (freq[i] != 0 && freq[i] != i) {
                return false;
            }
        }
        return true;
    }

    public static int nextBeautifulNumber(int n) {
        int i = n + 1;
        while (true) {
            if (isBalanced(i)) {
                return i;
            }
            i += 1;
        }
    }

    public static void main(String[] args) {
        int n1 = 1;
        System.out.println(nextBeautifulNumber(n1));

        int n2 = 1000;
        System.out.println(nextBeautifulNumber(n2));

        int n3 = 3000;
        System.out.println(nextBeautifulNumber(n3));
    }
}

// E:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// M_2048_NextGreaterNumericallyBalancedNumber.java && java
// M_2048_NextGreaterNumericallyBalancedNumber && del
// M_2048_NextGreaterNumericallyBalancedNumber.class
// 22
// 1333
// 3133