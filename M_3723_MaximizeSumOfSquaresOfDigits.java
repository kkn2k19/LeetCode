// 31.10.2025
// https://leetcode.com/problems/maximize-sum-of-squares-of-digits/description/
// 3723. Maximize Sum of Squares of Digits

import java.util.*;

public class M_3723_MaximizeSumOfSquaresOfDigits {
    public static String maxSumOfSquares(int num, int sum) {
        int maxPossibleValue = num * 9;
        if (maxPossibleValue < sum)
            return "";

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < num) {
            int d = Math.min(9, sum);
            sb.append(d);
            sum -= d;
            i += 1;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int num1 = 2;
        int sum1 = 3;
        System.out.println(maxSumOfSquares(num1, sum1));

        int num2 = 2;
        int sum2 = 17;
        System.out.println(maxSumOfSquares(num2, sum2));

        int num3 = 1;
        int sum3 = 10;
        System.out.println(maxSumOfSquares(num3, sum3));
    }
}

// E:\Karan_codes\LeetCode>cd "e:\Karan_codes\LeetCode\" && javac
// M_3723_MaximizeSumOfSquaresOfDigits.java && java
// M_3723_MaximizeSumOfSquaresOfDigits && del
// M_3723_MaximizeSumOfSquaresOfDigits.class
// 30
// 98
