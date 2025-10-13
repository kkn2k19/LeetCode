// 13.10.2025
// https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/description/
// 1317. Convert Integer to the Sum of Two No-Zero Integers

import java.util.*;

public class E_1317_ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    public static int[] getNoZeroIntegers(int n) {
        for (int a = 1; a < n; a++) {
            int b = n - a;
            if (!containsZero(a) && !containsZero(b))
                return new int[] { a, b };
        }
        // return new int[0];// dont know what to return here
        return new int[] {};
    }

    public static boolean containsZero(int n) {
        while (n > 0) {
            if (n % 10 == 0)
                return true;
            n /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        int n1 = 2;
        System.out.println(Arrays.toString(getNoZeroIntegers(n1)));

        int n2 = 11;
        System.out.println(Arrays.toString(getNoZeroIntegers(n2)));
    }
}

// e:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// E_1317_ConvertIntegerToTheSumOfTwoNoZeroIntegers.java && java
// E_1317_ConvertIntegerToTheSumOfTwoNoZeroIntegers && del
// E_1317_ConvertIntegerToTheSumOfTwoNoZeroIntegers.class
// [1, 1]
// [2, 9]